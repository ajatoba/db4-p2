package esseecraque.controller.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import esseecraque.model.ejb.VideoSessionFacadeRemote;
import esseecraque.model.util.LoggerUtil;
import esseecraque.model.util.ServiceLocator;
import esseecraque.model.vo.VideoVO;


/**
 * Servlet implementation class GravaVideoServlet
 */
public class GravaVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GravaVideoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {

			String req = request.getParameter("operacao");
			
			if(req!= null && req.length() > 0){
				if("gravar".equalsIgnoreCase(req)){
					gravarVideo(request, response);					
				}else if("consultar".equalsIgnoreCase(req)){
					consultar(request, response);
				}
				else{
					response.getWriter().write("Operação não informada");
				}
			}else{
				response.getWriter().write("Operação não informada");						
				
//				Properties props = new Properties();				
//				 InitialContext ictx = new InitialContext(props);
//				Session mailSession = (Session) ictx.lookup("java:/Mail");
//				String username = (String) props.get("mail.smtps.user");
//				String password = (String) props.get("mail.smtps.password");
//				
//				MimeMessage message = new MimeMessage(mailSession);
//				message.setSubject("teste");
//				message.setRecipients(javax.mail.Message.RecipientType.TO,
//						javax.mail.internet.InternetAddress.parse("fgayani@gmail.com" , false));
//				message.setText("terdste");
//				message.setFrom(new InternetAddress("devcodigo@gmail.com"));
//				message.saveChanges();
//
//				Transport transport = mailSession.getTransport("smtps");
//				try {
//					transport.connect(username, password);
//
//					transport.sendMessage(message, message.getAllRecipients());
//					LoggerUtil.info("Message sent:" + message.toString());
//				} finally {
//					transport.close();
//				}
			}
			
			
		} catch (Exception e) {
			response.getWriter().write(e.getMessage());
		}		
	}
	
	private void gravarVideo(HttpServletRequest request, HttpServletResponse response) throws NamingException{
		String uploadedFileName  = request.getParameter("uploadedFileName");
		Long idAssinante         = Long.valueOf(request.getParameter("idAssinante"));
		Long idVideo             = Long.valueOf(request.getParameter("idVideo"));
		String nomeNovoArquivo   = request.getParameter("nomeNovoArquivo");
		String pastaDestino      = request.getParameter("pastaDestino");
		
		VideoVO videoVO = new VideoVO();		
		videoVO.setArquivoOrigem(uploadedFileName);		
		videoVO.setIdAssinante(idAssinante);		
		videoVO.setIdVideo(idVideo);		
		videoVO.setNomeVideoDestino(nomeNovoArquivo);		
		videoVO.setPathDestino(pastaDestino);		
		VideoSessionFacadeRemote ejb = (VideoSessionFacadeRemote) ServiceLocator.getInstance().locateEJB(VideoSessionFacadeRemote.REMOTE);
		
		ejb.gravarVideo(videoVO);
		
	}
	
	private void consultar(HttpServletRequest request, HttpServletResponse response) throws IOException, NamingException{
					
			String idVideo = request.getParameter("idVideo");
			String tipoRequisicao = request.getParameter("tipo");
			
		
			VideoSessionFacadeRemote ejb = (VideoSessionFacadeRemote) ServiceLocator.getInstance().locateEJB(VideoSessionFacadeRemote.REMOTE);
			StringBuilder path = new StringBuilder()
			.append(ejb.getPathArquivo(Long.valueOf(idVideo)));
			
			if("video".equalsIgnoreCase(tipoRequisicao)){
				path.append(".flv");
			}
			else{
				path.append(".jpg");
			}
			
			
			InputStream inputStream = new FileInputStream(path.toString());
			OutputStream outputStream = response.getOutputStream();
			int len ; 
			byte[] buf = new byte[1024];  
			while ((len = inputStream.read(buf)) > 0) {  
			  outputStream.write(buf, 0, len);  
			} 
			
			inputStream.close();  
			outputStream.close();
	}
}
