package com.degan.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {
	public static void main(String[] args) throws IOException{
		
		try(FileOutputStream fos = new FileOutputStream("E:/123.txt");
			BufferedOutputStream obs = new BufferedOutputStream(fos,5)){
			
			for(int i='1';i<='9';i++) {
				obs.write(i);
			}
			
//			fos.close();
//			obs.close();
		}catch(Exception e) { e.printStackTrace();}
	}
}
