package com.degan.test;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataOutputStreamEx2 {
	public static void main(String[] args) {
		byte[] result = null;
		try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
				DataOutputStream dos = new DataOutputStream(bos)) {
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			
			String[] hex = new String[result.length];
			
			for(int i=0;i<result.length;i++) {
				if(result[i] < 0) {
					hex[i] = String.format("%02x", result[i]+256);
				}else {
					hex[i] = String.format("%02x",result[i]);
				}
			}
			
			System.out.println("10진수 : "+Arrays.toString(result));
			System.out.println("16진수 : "+Arrays.toString(hex));
			
		}catch(IOException e){
			e.printStackTrace();
		}
				
	}
}
