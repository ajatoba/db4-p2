package esseecraque.action;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import esseecraque.bean.Assinante;
import esseecraque.dao.AssinanteDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.form.*;
import esseecraque.util.*;

public final class AssinanteAction extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
		
		MessageResources messageResources = null;
		FileOutputStream os = null;
		PrintStream ps = null;
		DataOutputStream ods = null;
		try {

			messageResources = getResources(req);
			
			Assinante a = new Assinante();
			
			AssinanteForm aForm = (AssinanteForm) form;

			a.setEmail(aForm.getEmail());
			a.setPassword(aForm.getPassword());
			a.setNome(aForm.getNome());
			a.setCpf(aForm.getCpf());
			a.setEndereco(aForm.getEndereco());
			a.setCidade(aForm.getCidade());
			a.setEstado(aForm.getEstado());
			a.setUsername(aForm.getUsername());
			a.setHeight(aForm.getHeight());
			a.setWeight(aForm.getWeight());
			a.setPosition(aForm.getPosition());
			
			//DATA ATUAL
			java.util.Date data = new java.util.Date();   
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String strData = formato.format(data);
	        
	        a.setDataCadastro(strData); 
			
	        //********** CRIANDO DIRETÓRIO DO USUÁRIO ***********

			
			String docRoot 		= (String) SiteManager.getInstance().getProperties().get("docroot");
			String userFolder 	= (String) SiteManager.getInstance().getProperties().get("user_folder");
			String path 		= docRoot + userFolder + a.getUsername();
	        
			/*
		     * Caso o diretório de usuários não exista 
		     * (Por algum motivo não foi criado pelo Administrador), 
		     * é criado na hora
		     */
		    File userRoot = new File(docRoot + userFolder);
		    	if(!userRoot.exists()) userRoot.mkdir();
		    
		    /**************/
			
			File f = new File(path);
			
			if(!f.exists()){
				f.mkdir();
			}
			os = new FileOutputStream(path + System.getProperty("file.separator") + "index.html");		
			
			ps = new PrintStream(os);
			ods = new DataOutputStream(os);
			ods.flush();
			ods.writeBytes(new StringWriter().toString());	
	        
	        //***************************************************
	        					
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
			
			aDAO.salvar(a);
				
			aForm.reset(mapping, req);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			//return mapping.findForward(Constants.ADD_ASSINANTE_SUCESS);
			return mapping.findForward(Constants.REDIRECIONA_INDEX);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			req.setAttribute("mensagem_erro",messageResources.getMessage("erro.userFolderNotFound"));
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
			
		} catch (Exception e) {
			e.printStackTrace();			
			req.setAttribute("mensagem_erro", e.getMessage());
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
		}finally{
			if(os!=null) os.close();
			if(ods!=null) ods.close();
			if(ps!=null) ps.close();
		}

	}
	
	public ActionForward edit(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

		HttpSession objSession = req.getSession();
		
		MessageResources messageResources = null;
		
		try {

			messageResources = getResources(req);

			Assinante a = new Assinante();

			AssinanteForm aForm = (AssinanteForm) form;

			a.setId(aForm.getId());
			a.setEmail(aForm.getEmail());
			a.setPassword(aForm.getPassword());
			a.setNome(aForm.getNome());
			a.setCpf(aForm.getCpf());
			a.setEndereco(aForm.getEndereco());
			a.setCidade(aForm.getCidade());
			a.setEstado(aForm.getEstado());
			a.setDataCadastro(aForm.getDataCadastro());
			a.setUsername(aForm.getUsername());
			a.setHeight(aForm.getHeight());
			a.setWeight(aForm.getWeight());
			a.setPosition(aForm.getPosition());

			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();

			aDAO.atualizar(a);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			req.setAttribute("mensagem",messageResources.getMessage("msg.edit.assinante.sucesso"));
			return mapping.findForward(Constants.EDIT_ASSINANTE_SUCESS);

		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.EDIT_ASSINANTE_ERROR);
		}

	}
	
	public ActionForward list(ActionMapping mapping, 
			 					ActionForm form, 
			 					HttpServletRequest req, 
			 					HttpServletResponse resp) throws Exception {
		
			HttpSession objSession = req.getSession();

			try {
				
				String letra = null;
				
				letra = req.getParameter("letra");
				
				AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
				
				List<Assinante> list = aDAO.buscarAssinanteLetra(letra + "%");
				
				objSession.setAttribute(Constants.ASSINANTE_BEAN_LETRA, list);
				
				return mapping.findForward(Constants.LIST_ASSINANTE_SUCESS);

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.LIST_ASSINANTE_ERROR);
			}

	}
	
	public ActionForward login(ActionMapping mapping, 
				ActionForm form, 
				HttpServletRequest req, 
				HttpServletResponse resp) throws Exception {
		
		HttpSession objSessao = req.getSession();
		
		String msgActionForward = Constants.ASSINANTE_LOGIN_ERROR_FORWARD;
		
		MessageResources messageResources = getResources(req);
		
		try {

			Assinante a = new Assinante();
			
			AssinanteLoginForm aForm = (AssinanteLoginForm) form;

			a.setEmail(aForm.getEmail());
			a.setPassword(aForm.getPassword());			
			
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
			
			List<Assinante> resulLogin = aDAO.loginAssinante(a.getEmail(), a.getPassword());
			
			if (resulLogin.size()==0 || resulLogin==null){
				
				req.setAttribute("mensagem_erro", messageResources
						.getMessage("login_invalido"));
				
				msgActionForward = Constants.ASSINANTE_LOGIN_ERROR_FORWARD;
			
			}else{
				
				a = resulLogin.get(0);
				
					req.setAttribute(Constants.ASSINANTE_BEAN, a);
					objSessao.setAttribute(Constants.ASSINANTE_BEAN, a);
					
					String str_idAssinante = String.valueOf(a.getId());
					int idAssinate = Integer.parseInt(str_idAssinante);
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					Long qtd = (Long)vDAO.qtdVideo(idAssinate);
					objSessao.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);
					
					msgActionForward = Constants.LOGIN_FORWARD;

			}
			
			return mapping.findForward(msgActionForward);

		} catch (Exception e) {
			e.printStackTrace();
			
			req.setAttribute("mensagem_erro", MessageResources
					.getMessageResources("login_invalido"));
			
			return mapping.findForward(Constants.ASSINANTE_LOGIN_ERROR_FORWARD);
			
		}
		
	}
	
	public ActionForward remindPassword(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String email = req.getParameter("email");

		if (email != null || email.equals("")) {
			MessageResources messageResources = null;
			try {

				messageResources = getResources(req);
				AssinanteDAO dao = DAOFactory.ASSINANTE_DAO();
				Assinante user = dao.remindPassword(email);

				if (user == null) {
					req.setAttribute("mensagem", messageResources
							.getMessage("unregistered_user"));
				} else {

					SendMail mail = new SendMail();

					String smtpServer = (String) SiteManager.getInstance()
							.getProperties().get("smtp");

					mail.setFrom(messageResources.getMessage("webmaster"));
					mail.setSmtpServer(smtpServer);

					mail.setContentType("txt");
					mail.setSubject(messageResources
							.getMessage("password_reminder_subject"));
					mail.setTo(user.getEmail());
					mail.setMessage(messageResources
							.getMessage("password_reminder_message")
							+ " " + user.getPassword());

					mail.send();

					
				}
				req.setAttribute("mensagem", messageResources.getMessage("password_sent"));
				return mapping.findForward("password_reminder_out");

			} catch (Exception e) {
				req.setAttribute("mensagem", e.getMessage());
				return mapping.findForward("password_reminder_out");
			}
		} else {
			req.setAttribute("mensagem", "Por favor, digite seu email");
			return mapping.findForward("password_reminder_out");
		}

	}
	
	public ActionForward search(ActionMapping mapping, 
				ActionForm form, 
				HttpServletRequest req, 
				HttpServletResponse resp) throws Exception {

		HttpSession objSession = req.getSession();
		
		try {
		
			String nome=null,posicao=null,cidade=null;
			
			nome 	= req.getParameter("nome");
			posicao	= req.getParameter("posicao");
			cidade 	= req.getParameter("cidade");
			
			Assinante assinante = new Assinante();
			assinante.setNome(nome);
			assinante.setPosition(posicao);
			assinante.setCidade(cidade);
			
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
			
			List<Assinante> list = aDAO.search(assinante);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN_LETRA, list);
			
			return mapping.findForward(Constants.LIST_ASSINANTE_SUCESS);
			
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.LIST_ASSINANTE_ERROR);
		}

	}

	public ActionForward logout(ActionMapping mapping, 
			ActionForm form, 
			HttpServletRequest req, 
			HttpServletResponse resp) throws Exception {
		HttpSession objSession = req.getSession();
		
		try {
			objSession.setAttribute(Constants.ASSINANTE_BEAN, null);
			return mapping.findForward(Constants.REDIRECIONA_INDEX);
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.REDIRECIONA_INDEX);
		}
		
	}
	
	public ActionForward sendCommunication(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String mensagem = req.getParameter("mensagem");
		
		MessageResources messageResources = null;
		try {

			messageResources = getResources(req);
			SendMail mail = new SendMail();

			String smtpServer = (String) SiteManager.getInstance()
							.getProperties().get("smtp");

					
			mail.setSmtpServer(smtpServer);
			mail.setContentType("txt");					
			mail.setFrom(email);
			mail.setTo(messageResources.getMessage("webmaster"));
			mail.setSubject(messageResources.getMessage("fale_conosco_subject"));
			mail.setMessage("De:" + nome + "\n" + mensagem);

			mail.send();

			req.setAttribute("mensagem", messageResources.getMessage("fale_conosco_sent"));

			return mapping.findForward("fale_conosco_out");

			} catch (Exception e) {
				req.setAttribute("mensagem", e.getMessage());
				return mapping.findForward("fale_conosco_out");
			}		
	}

}
