package esseecraque.action;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.Assinante;
import esseecraque.bean.Clube;
import esseecraque.bean.Torneio;
import esseecraque.dao.AssinanteDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.form.AssinanteForm;
import esseecraque.form.AssinanteLoginForm;
import esseecraque.form.PerfilForm;
import esseecraque.util.Constants;
import esseecraque.util.HibernateUtil;
import esseecraque.util.SendMail;



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

			a.setNome(aForm.getNome());
			a.setEmail(aForm.getEmail());
			a.setPassword(aForm.getPassword());
			a.setAim(aForm.getAim());			
			a.setEndereco(aForm.getEndereco());
			a.setCidade(aForm.getCidade());
			a.setEstado(aForm.getEstado());
			a.setPais(aForm.getPais());
			a.setCep(aForm.getCep());
			a.setPhoneNumber(aForm.getPhoneNumber());
			a.setCellPhoneNumber(aForm.getCellPhoneNumber());
			a.setNacionalidade(aForm.getNacionalidade());
			
			//DATA ANIVERSÁRIO
	        java.util.Date dataAniversario = new java.util.Date(aForm.getAnoNascimento()-1900, aForm.getMesNascimento()-1,aForm.getDiaNascimento());   
            SimpleDateFormat formatoAniversario = new SimpleDateFormat("yyyy-MM-dd");  
            String strDataAniversario = formatoAniversario.format(dataAniversario);
			
            a.setBirthDate(strDataAniversario);
			
            //DATA ATUAL
			java.util.Date data = new java.util.Date();   
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String strData = formato.format(data);
	        
	        a.setDataCadastro(strData); 
	        
	        a.setUsername(aForm.getUsername());		
							        
	        //********** CRIANDO DIRETÓRIO DO USUÁRIO ***********
			
			String docRoot 		= System.getProperty("docroot");
			String userFolder 	= System.getProperty("user_folder");
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
			
			if(req.getParameter("opcao_cadastro").equals("1")){			
				req.setAttribute("mensagem_sucesso",messageResources.getMessage("msg.add.assinante.sucesso"));
				return mapping.findForward(Constants.ADD_ASSINANTE_SUCESS);
			}else {
				return mapping.findForward(Constants.ADD_ASSINANTE_SUCESS_PERFIL);
			}
			
			
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			req.setAttribute("mensagem_erro",messageResources.getMessage("erro.userFolderNotFound"));
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
			
		} catch (Exception e) {
			e.printStackTrace();
			if(e.getCause().getMessage().indexOf("Duplicate entry") >= 0 ){
				if(e.getCause().getMessage().indexOf("for key 2") >= 0){
					//E-mail Repetido
					req.setAttribute("mensagem_erro",messageResources.getMessage("erro.emailRepetido"));					
				}else if(e.getCause().getMessage().indexOf("for key 4") >= 0){
					//URL Repetido
					req.setAttribute("mensagem_erro",messageResources.getMessage("erro.urlRepetida"));					
				}
			}else{							
				req.setAttribute("mensagem_erro", e.getMessage());				
			}
			return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
		}finally{
			if(os!=null) os.close();
			if(ods!=null) ods.close();
			if(ps!=null) ps.close();
		}

	}
		
	public ActionForward editPerfil(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {
	
		HttpSession objSession = req.getSession();
		
		MessageResources messageResources = null;
		
		try {

			messageResources = getResources(req);

			Assinante a = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);

			PerfilForm aForm = (PerfilForm) form;
			
			a.setWeight(aForm.getWeight());
			a.setHeight(aForm.getHeight());
			a.setPosition(aForm.getPosition());
			a.setComment(aForm.getComment());
			a.setShowAim(aForm.isShowAim());
			a.setShowCellPhone(aForm.isShowCellPhone());
			a.setShowEmail(aForm.isShowEmail());
			a.setShowPhone(aForm.isShowPhone());
			
			//CLUBES
	        Set<Clube> clubes = new HashSet<Clube>();
	        
	        String[] nomeClube, cidadeClube, anoInicioClube, anoFimClube;
	        
	        nomeClube 		= req.getParameterValues("nome_clube");
	        cidadeClube 	= req.getParameterValues("cidade_clube");
	        anoInicioClube 	= req.getParameterValues("ano_inicio_clube");
	        anoFimClube 	= req.getParameterValues("ano_fim_clube");
	        
	        Clube clube = null;
	        if(nomeClube != null && nomeClube.length > 0){
		        for(int x=0; x < nomeClube.length; x++){
		        	clube = new Clube();
		        	clube.setName(nomeClube[x]);
		        	clube.setCity(cidadeClube[x]);
		        	
		        	try {
		        		clube.setStartYear(Integer.parseInt(anoInicioClube[x]));
			        	clube.setEndYear(Integer.parseInt(anoFimClube[x]));
					} catch (NumberFormatException nfe) {
						nfe.printStackTrace();			
						req.setAttribute("mensagem_erro", messageResources.getMessage("msg.add.assinante.converter.anos.erro"));
						return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
					}catch (Exception e) {
						e.printStackTrace();			
						req.setAttribute("mensagem_erro", messageResources.getMessage("msg.add.assinante.converter.anos.erro"));
						return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
					}
		        	
					clube.setAssinante(a);
		        	
		        	clubes.add(clube);
		        }
		        
		        a.setClubes(clubes);
	        }
	        
	        
	        //***************************************************
	        
	        //TORNEIOS
	        Set<Torneio> torneios = new HashSet<Torneio>();
	        
	        String[] nomeTorneio, cidadeTorneio, anoTorneio, clubeTorneio;
	        
	        nomeTorneio 	= req.getParameterValues("nome_torneio");
	        cidadeTorneio 	= req.getParameterValues("cidade_torneio");
	        anoTorneio 		= req.getParameterValues("ano_torneio");
	        clubeTorneio 	= req.getParameterValues("clube_torneio");
	        
	        Torneio torneio = null;
	        if(nomeTorneio != null && nomeTorneio.length > 0){
		        for(int x=0; x < nomeTorneio.length; x++){
		        	torneio = new Torneio();
		        	torneio.setName(nomeTorneio[x]);
		        	torneio.setCity(cidadeTorneio[x]);
		        	torneio.setTeam(clubeTorneio[x]);
		        	try {
		        		torneio.setYear(Integer.parseInt(anoTorneio[x]));		        	
					} catch (NumberFormatException nfe) {
						nfe.printStackTrace();			
						req.setAttribute("mensagem_erro", messageResources.getMessage("msg.add.assinante.converter.anos.erro"));
						return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
					}catch (Exception e) {
						e.printStackTrace();			
						req.setAttribute("mensagem_erro", messageResources.getMessage("msg.add.assinante.converter.anos.erro"));
						return mapping.findForward(Constants.ADD_ASSINANTE_ERROR);
					}
		        	
					torneio.setAssinante(a);
		        	
		        	torneios.add(torneio);
		        }
	        
		        a.setTorneios(torneios);
	        }
	        
	        
	        //***************************************************
	        
	        AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();

	        System.out.println("NOME:" + a.getNome());
	        System.out.println("NACIONALIDADE:" + a.getNacionalidade());
	        
			aDAO.atualizar(a);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			req.setAttribute("mensagem_sucesso",messageResources.getMessage("msg.edit.perfil.sucesso"));
			return mapping.findForward(Constants.EDIT_PERFIL_SUCESS);
	        
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("mensagem_erro",e.getMessage());
			return mapping.findForward(Constants.EDIT_PERFIL_ERROR);
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

			Assinante a = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);

			AssinanteForm aForm = (AssinanteForm) form;
			
			a.setNome(aForm.getNome());
			a.setEmail(aForm.getEmail());
			a.setAim(aForm.getAim());			
			a.setEndereco(aForm.getEndereco());
			a.setCidade(aForm.getCidade());
			a.setEstado(aForm.getEstado());
			a.setPais(aForm.getPais());
			a.setCep(aForm.getCep());
			a.setPhoneNumber(aForm.getPhoneNumber());
			a.setCellPhoneNumber(aForm.getCellPhoneNumber());
			a.setNacionalidade(aForm.getNacionalidade());
			
			//DATA ANIVERSÁRIO
	        java.util.Date dataAniversario = new java.util.Date(aForm.getAnoNascimento()-1900, aForm.getMesNascimento()-1,aForm.getDiaNascimento());   
            SimpleDateFormat formatoAniversario = new SimpleDateFormat("yyyy-MM-dd");  
            String strDataAniversario = formatoAniversario.format(dataAniversario);
			
            a.setBirthDate(strDataAniversario);
					
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();

			aDAO.atualizar(a);
			
			objSession.setAttribute(Constants.ASSINANTE_BEAN, a);
			
			req.setAttribute("mensagem_sucesso",messageResources.getMessage("msg.edit.assinante.sucesso"));
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
				
				List<Assinante> list = aDAO.buscarAssinanteLetra(letra);
				
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

			Assinante aF = new Assinante();
			
			AssinanteLoginForm aForm = (AssinanteLoginForm) form;

			aF.setEmail(aForm.getEmail());
			aF.setPassword(aForm.getPassword());			
			
			AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();
			
			Assinante a = aDAO.loginAssinante(aF.getEmail(), aF.getPassword());
			
			if (a==null){
				
				req.setAttribute("mensagem_erro", messageResources
						.getMessage("login_invalido"));
				
				msgActionForward = Constants.ASSINANTE_LOGIN_ERROR_FORWARD;
			
			}else{
												
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

					String smtpServer = (String) System.getProperty("smtp");

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
		
		String nome=null,posicao=null,cidade=null;
		
		nome 	= req.getParameter("nome");
		posicao	= req.getParameter("posicao");
		cidade 	= req.getParameter("cidade");
		
		String keyWord = "";
		
		if(nome !=null && !nome.equals("")){
			keyWord+="nome: "+nome;
			if(( posicao !=null && !posicao.equals("")) || (cidade !=null && !cidade.equals(""))){
				keyWord+=" AND ";
			}
		}
		
		if(posicao !=null && !posicao.equals("")){
			keyWord+="position: "+posicao;
			if (cidade !=null && !cidade.equals("")){
				keyWord+=" AND ";
			}
		}
		
		if(cidade !=null && !cidade.equals("")){
			keyWord+="cidade: "+cidade;
		}
				
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MessageResources messageResources = null;
		
		try {
		
			messageResources = getResources(req);
			
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			Transaction tx = fullTextSession.beginTransaction();

			String[] fields = new String[]{"nome","position", "cidade"};
			MultiFieldQueryParser parser = new MultiFieldQueryParser(fields, new StandardAnalyzer());
			org.apache.lucene.search.Query query = parser.parse(keyWord);

			org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, Assinante.class);

			List result = hibQuery.list();
			
			tx.commit();
			session.close();
			
			
			req.setAttribute(Constants.ASSINANTE_BEAN_LETRA, result);
			return mapping.findForward(Constants.LIST_ASSINANTE_SUCESS);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute(Constants.VIDEOS_BUSCA, "ERRO NA BUSCA:" +e.getMessage());
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

			String smtpServer = (String) System.getProperty("smtp");

					
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
