package com.github.rgmatute.Utils;

public class EpicoUtils {
	
	
	public static String getJWT() {
		
		int validezInMin =  1440;
		String key = "cpMW1RjvLE41Ra3GwMZYTLhyMwZNesxo";
		String token = "Bearer ";
		
		return token;
	}
	
	
	public static String MD5(String md5) {
		
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < array.length; i++) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println("EpicoUtils-MD5-Error: " + e.getMessage());
		}
		
		return null;
	}

}
