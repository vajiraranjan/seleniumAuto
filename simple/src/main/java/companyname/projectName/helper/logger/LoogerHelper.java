package companyname.projectName.helper.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoogerHelper 
{

	
	private static boolean root=false;
	
	public static Logger getLogger(Class cls) {
	if(root)
	{
		return Logger.getLogger(cls);
	}
	PropertyConfigurator.configure("/Users/vajiraranjan/Downloads/Auto_Eclipse/seleniumAuto/simple/src/main/resources/config/log4j.properties");
	root= true;
	return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) 
	{
		BasicConfigurator.configure();
		Logger log = LoogerHelper.getLogger(LoogerHelper.class);
		log.info("logger is configured");
		log.info("logger is configured");
		log.info("logger is configured");
	} 
													
}

