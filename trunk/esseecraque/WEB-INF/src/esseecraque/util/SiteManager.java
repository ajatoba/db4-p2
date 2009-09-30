package esseecraque.util;

import java.io.InputStream;
import java.util.Properties;

public class SiteManager {

		
		public static SiteManager instance;
		
		private Properties properties = null;
		
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
		
		public Properties getProperties() throws Exception
		{
			if(properties == null)
			{
				properties = new Properties();
		        InputStream stream = SiteManager.class.getClassLoader().getResourceAsStream("resource.properties");
		        properties.load(stream);         
	            stream.close();
			}
			
			return properties;
		}
		
	
}
