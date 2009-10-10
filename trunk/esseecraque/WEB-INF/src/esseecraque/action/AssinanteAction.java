package esseecraque.action;

import java.io.DataOutputStream;
import java.io.File;
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
import esseecraque.util.Constants;
import esseecraque.util.SiteManager;

public final class AssinanteAction extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
		
		try {

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
			
			//DATA ATUAL
			java.util.Date data = new java.util.Date();   
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String strData = formato.format(data);
	        
	        a.setDataCadastro(strData); 
			
	        //********** CRIANDO DIRETÓRIO DO USUÁRIO ***********
	        
	        FileOutputStream os = null;
			PrintStream ps = null;
			DataOutputStream ods = null;
			
			String docRoot 		= (String) SiteManager.getInstance().getProperties().get("docroot");
			String userFolder 	= (String) SiteManager.getInstance().getProperties().get("user_folder");
			String path 		= docRoot + userFolder + a.getUsername();
	        
			File f = new File(path);
			
			if(!f.exists())
				f.mkdir();
			
			os = new FileOutputStream(path + System.getProperty("file.separator") + "index.html");		
			
			ps = new PrintStream(os);
			ods = new DataOutputStream(os);
			ods.flush();
			ods.writeBytes(new StringWriter().toString());	
	        
	        //***************************************************
	        					
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			return mapping.findForward(Constants.ASSINANTE_PERFIL);
			
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
		}

	}
	
	public ActionForward addPerfil(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
		
		Assinante a = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);
		AssinanteForm aForm = (AssinanteForm) form;
		
		try{
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
			a.setComment(aForm.getComment());
			a.setPosition(aForm.getPosition());
			a.setTournaments(aForm.getTournaments());
			a.setTeams(aForm.getTeams());
				
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
				
			aDAO.salvar(a);
				
			aForm.reset(mapping, req);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			return mapping.findForward(Constants.ADD_ASSINANTE_SUCESS);
		
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
		}
	}	
	
	public ActionForward edit(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

		try {

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

			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();

			aDAO.atualizar(a);
			
			aForm.reset(mapping, req);

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

			try {
				
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

}
