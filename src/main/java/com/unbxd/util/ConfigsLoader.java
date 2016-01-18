package com.unbxd.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * A class to get all the properties
 * @author arpan@unbxd.com
 *
 */
public class ConfigsLoader {
	private Properties prop = new Properties();
	private InputStream inputStream;
	private static Logger log = LogManager.getLogger(ConfigsLoader.class.getName());
	private static ConfigsLoader instance = null;

	/**
	 * The private constructor
	 * @param propFileName
	 * @throws IOException 
	 */
	private ConfigsLoader(String propFileName) throws IOException{
		log.trace("Loading config " + propFileName);
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			if (inputStream != null) {
				prop.load(inputStream);
			}
			
		} catch (Exception e) {
			log.error("Error occured while loading the config file", e);
			e.printStackTrace();
		} finally{
			inputStream.close();
		}
		
	}
	
	/**
	 * The static method to get the instance 
	 * @param configFileName
	 * @return
	 * @throws IOException 
	 */
	public static ConfigsLoader getInstance(String configFileName) throws IOException {
	    if(instance ==null) {
	        instance = new ConfigsLoader(configFileName);
	    }

	    return instance;
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
		
	}
	
	public static void main(String[] args) throws IOException {
		String configFileName = "config.properties";
		ConfigsLoader config = ConfigsLoader.getInstance(configFileName);
		log.trace(config.getProperty("password") );
	}

}
