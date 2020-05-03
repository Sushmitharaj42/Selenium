package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileManager {
Properties pro;
{
	try{
		FileInputStream fis=new FileInputStream("./configuration.Properties");
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e)
	{
		System.out.println("invalid path");
	}
}
public String getUrl()
{
	String url=pro.getProperty("QAtest1");
	if(url==null)
	{
		throw new RuntimeException("invalid url");
		
	}
	return url;
}
public long getImplicitlywait()
{
	String implicitlywait=pro.getProperty("iw");
	if(implicitlywait==null)
	{
		throw new RuntimeException("invalid time");
		
	}
	return Long.parseLong(implicitlywait);
}
/*public static String getappurl() {
	// TODO Auto-generated method stub
	return null;
}
}*/
}