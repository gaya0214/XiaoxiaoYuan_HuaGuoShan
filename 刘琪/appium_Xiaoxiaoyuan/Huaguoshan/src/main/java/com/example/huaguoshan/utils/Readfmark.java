package com.example.huaguoshan.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readfmark {

	public static final String filePath="conf/config.fmark";
	

	public static String getPropertyValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		fis.close();
		return prop.getProperty(key);
		
	}
}
