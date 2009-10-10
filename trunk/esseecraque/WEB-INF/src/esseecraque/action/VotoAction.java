package esseecraque.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import esseecraque.bean.Voto; 
import esseecraque.dao.VotoDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.util.Constants;

public class VotoAction extends DispatchAction{
		
	public ActionForward votarAdd(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
			
		HttpSession objSession = req.getSession();
			
		Long idVideo = Long.parseLong(req.getParameter("idVideo"));
		int notaUser = Integer.parseInt(req.getParameter("nota"));
		
		int qtd = 0;
		double nota = 0;
		double media = 0;
		
		
		try{
			
			Voto vt = new Voto();
			
			VotoDAO vtDAO = DAOFactory.VOTO_DAO();
			
			vt = vtDAO.buscarVoto(idVideo);
			
			Voto v = new Voto();
			
			if(vt==null){
				v.setQtdVoto(1);
				v.setNota(notaUser);
				v.setIdVideo(idVideo);
				v.setMedia(notaUser);
			}else{
				qtd = vt.getQtdVoto();
				nota = vt.getNota();
				
				v.setQtdVoto(qtd + 1);
				v.setNota(nota + notaUser);
				v.setIdVideo(idVideo);

				media = Math.ceil(v.getNota()/v.getQtdVoto());
				
				v.setMedia(media);
				
			}
			
			vtDAO.salvar(v);
			
			objSession.setAttribute(Constants.VOTO_BEAN, v);
			
			return mapping.findForward(Constants.BUSCA_VOTO_SUCESS);
			
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.BUSCA_VOTO_ERROR);
		}
		
	}
}