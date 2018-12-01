package com.st.assignment.animal.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageUtil.class);
	
	private static ResourceBundle resourceBundle = null;
	
	static {
		init();
	}
		
	private static void init()  {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "application.properties";
		Properties appProps = new Properties();
		try {
			appProps.load(new FileInputStream(appConfigPath));
		} catch (IOException e) {
			System.err.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}		
		
		String language = appProps.getProperty("language");
		if(logger.isInfoEnabled())
			logger.info("Messages language: " + language);
		
		if(language == null)
			resourceBundle =  ResourceBundle.getBundle("messages");
		else
			resourceBundle =  ResourceBundle.getBundle("messages", new Locale(language));
	} 
	
	public static String getMessage(String msgKey) {
		return resourceBundle.getString(msgKey);
	}
	

}
