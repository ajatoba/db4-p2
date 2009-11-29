package esseecraque.model.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class SiteManager {

		
		public static SiteManager instance;
		
		private static Properties properties;
		
		private SiteManager()
		{
			super();
		}

		public static SiteManager getInstance()
		{
			if (instance == null)
			{
				instance = new SiteManager();
			}
			return instance;
		}
		
		public Properties getProperties() throws IOException {
			if(properties == null)
			{
				properties = new Properties();
		        InputStream stream = SiteManager.class.getClassLoader().getResourceAsStream("db4EsseECraque.properties");
		        properties.load(stream);         
	            stream.close();
			}
			
			return properties;
		}
		
		public static void writerStaticFile(String path, String fileName, String action_url)
        throws IOException,Exception
    {
    	URL url = null;
        URLConnection conection = null;
        InputStream stream =null;
        ByteArrayOutputStream baos = null;
        FileOutputStream out = null;
    	
    	try {
    		
    	    url = new URL(action_url);
            conection = url.openConnection();
            stream = conection.getInputStream();
            baos = new ByteArrayOutputStream();
            int bytesRead = 0;
            byte buffer[] = new byte[1024];
            while((bytesRead = stream.read(buffer, 0, buffer.length)) != -1) 
                baos.write(buffer, 0, bytesRead);
            stream.close();
            File file = new File(path);
            if(!file.exists())
                file.mkdir();
            File f = new File(file, fileName);
            if(!f.exists())
                f.createNewFile();
            out = new FileOutputStream(f);
            out.write(baos.toByteArray());
            
		} catch (Exception e) {
			throw e;
		}finally
		{			
			if(baos != null)  baos.close();
			if(out != null) out.close();
			if(stream != null) stream.close();			
		}
        
    }
		
		public static void main(String[] x){
			
			SiteManager sm = new SiteManager();
			
			try {
				sm.writerStaticFile("c:\\", "videos.html", "http://localhost:8080/esseecraque/welcome.do?act=ultimosVideos");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
