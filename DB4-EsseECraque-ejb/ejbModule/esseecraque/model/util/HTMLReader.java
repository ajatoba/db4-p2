package esseecraque.model.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class HTMLReader {

	public static String readHTML(String fileLocation) throws Exception{
		String html = "";
		String line = "";
		
		FileReader myFile = null;
		BufferedReader buff =null;
		
		try {
			  myFile = new FileReader(fileLocation);
			  buff = new BufferedReader(myFile);
			  
			  boolean eof = false;
			  
			  while(!eof){				  
				  line = buff.readLine();
				  if(line != null ){
					  html += line;
				  }else{
					  eof = true;
				  }
			  }
			  
			} catch (IOException e) {
			  e.printStackTrace();
			} finally{ 
			  buff.close();
			  myFile.close();
			}
		
		return html;
	}

	public static String replaceAllTags(String message, Map< String, String > tags)
	{
	        StringBuilder sb = new StringBuilder( message );
	        boolean tagFound = false;
	        /**
	         * prevent endless circular text replacement loops
	         */
	        long recurrancyChecker = 5000;

	        do
	        {
	                tagFound = false;
	                Iterator it = tags.entrySet().iterator();
	                while( it.hasNext() )
	                {
	                        Map.Entry pairs = (Map.Entry) it.next();

	                        int start = sb.indexOf( pairs.getKey().toString() );

	                        while( start > -1 && --recurrancyChecker > 0 )
	                        {
	                                int length = pairs.getKey().toString().length();
	                                sb.replace( start, start + length, pairs.getValue().toString() );
	                                start = sb.indexOf( pairs.getKey().toString() );
	                                tagFound = true;
	                        }
	                }
	        }
	        while( tagFound && --recurrancyChecker > 0 );
	        return sb.toString();
	}

	/*
	
	public static void main(String[] x) throws Exception{
		
		FileOutputStream os = null;
		PrintStream ps = null;
		DataOutputStream ods = null;
		
		try {
			String template = HTMLReader.readHTML("E:\\jatoba\\projetos\\esseecraque\\WebContent\\templates\\ultimos_videos_template.html");
			String html = "";
			Map<String,String>  tags = null;
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();			
			
			List<Video> lv = vDAO.buscarUltimosVideos();
						
			Iterator<Video> it = lv.iterator();
			
			while (it.hasNext()) {
				Video video = (Video) it.next();				
				tags = new HashMap<String, String>();
				
				tags.put("<ID_VIDEO>", String.valueOf(video.getId()));
				tags.put("<DESCRICAO_VIDEO>", video.getDescription());
				tags.put("<DATA_VIDEO>", video.getDataUpload());
				tags.put("<THUMB_VIDEO>", video.getPathImage());
				
				html += replaceAllTags(template, tags);
			}

			
			String docRoot = "E:\\jatoba\\projetos\\esseecraque\\WebContent\\";//req.getRealPath("/");//(String)SiteManager.getInstance().getProperties().getProperty("docroot");
			String fileName = "ultimos_videos.html";
			
			System.out.println(html);
			
			String path = docRoot+fileName;

			os = new FileOutputStream(path);		
			
			ps = new PrintStream(os);
			ods = new DataOutputStream(os);
			ods.flush();
			ods.writeBytes(html);	
			
		} catch (Exception e) {
			
			System.out.println("ERRO" +e.getMessage());
			
		}finally{
			if(os!=null) os.close();
			if(ods!=null) ods.close();
			if(ps!=null) ps.close();
		}
		
		
	}
	*/
}
