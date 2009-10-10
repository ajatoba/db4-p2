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
			
			if(vt==null || vt.equals("")){
				vt.setQtdVoto(1);
				vt.setNota(notaUser);
				vt.setIdVideo(idVideo);
				vt.setMedia(notaUser);
			}else{
				qtd = vt.getQtdVoto();
				nota = vt.getNota();
				
				vt.setQtdVoto(qtd + 1);
				vt.setNota(nota + notaUser);
				vt.setIdVideo(idVideo);

				media = Math.ceil(vt.getNota()/vt.getQtdVoto());
				
				vt.setMedia(media);
				
			}
			
			objSession.setAttribute(Constants.VOTO_BEAN, vt);
			
			return mapping.findForward(Constants.BUSCA_VOTO_SUCESS);
			
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.BUSCA_VOTO_ERROR);
		}
		
	}
}