package utilPackage;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SuperBase {
	
	public static boolean isRootFolderCreated=false;
	public static String rootFolder;
	
	public SuperBase()
	{
		if(!isRootFolderCreated)
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");  
			LocalDateTime now = LocalDateTime.now(); 
			String path="c:/FailedTCScreenshots/"+dtf.format(now)+"";
			File theDir = new File(path);			
			if (!theDir.exists())
			{							 
			    theDir.mkdirs();
			    isRootFolderCreated=true;
			    rootFolder=path;
			}
		}
	}

}
