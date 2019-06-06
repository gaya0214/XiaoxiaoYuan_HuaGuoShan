package com.example.huaguoshan.utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadHTML {
	public static String reMailString(String buff_path) throws IOException{
		StringBuffer buff=new StringBuffer();
		InputStreamReader in=null;
		BufferedReader br=null;	
//		String data_path = Readfmark.getPropertyValue("datapath");		
		String path = System.getProperty("user.dir") +"/test-output/s1/test1.html";
		File file=new File(path);
		
		try {
			in=new InputStreamReader(new FileInputStream(file),"utf-8");
			br=new BufferedReader(in);
			String line=null;
			while((line=br.readLine()) != null){
				buff.append(line).append("\n");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		buff_path=buff.toString();
		return buff_path;
	}
}

