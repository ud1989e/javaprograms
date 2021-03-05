package com.example.demo.worksheetPRograms;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;
public class DemoProgram13 {
	
	public static void main(String[] args) throws IOException {
		String str = "aaaaabbbbccccddddaaaaeeeeffffffffffffffffffff";
	    byte[] barrayc= compress(str);
	    System.out.println("Original length:"+str.length());
	    System.out.println("Original String:"+str);
	    System.out.println("compress length:"+barrayc.length);
	    byte[] barrayd= decompress(barrayc);
	    System.out.println("after decompression :"+convertByteToString(barrayd));
	    System.out.println("decompress length:"+barrayd.length);
	    String compressedString=compressAndReturnB64(str);
	    System.out.println("Base 64 compressed String:"+compressedString+"length:"+compressedString.length());
	    String DecompressedString = decompressB64(compressedString);
	    System.out.println("base 64 decompressed String:"+DecompressedString+"length:"+DecompressedString.length());
		
	}
	public static String convertByteToString(byte[] byteValue) 
    { 
		String str = new String(byteValue, StandardCharsets.UTF_8); 
		return str;
    } 
	
	public static byte[] compress(String str) throws IOException {
	  ByteArrayOutputStream os = new ByteArrayOutputStream();  
	    try (DeflaterOutputStream dos = new DeflaterOutputStream(os)) {
	        dos.write(str.getBytes() );
	        }
	    return os.toByteArray();
	}
	public static byte[] decompress(byte[] compressedTxt) throws IOException {
	    ByteArrayOutputStream os = new ByteArrayOutputStream();  
	    try (OutputStream ios = new InflaterOutputStream(os)) {
	        ios.write(compressedTxt);    }
	 
	    return os.toByteArray();}

	public static String compressAndReturnB64(String text) throws IOException {
	        return new String(Base64.getEncoder().encode(compress(text)));    }
	 
	    public static String decompressB64(String b64Compressed) throws IOException {
	        byte[] decompressedBArray = decompress(Base64.getDecoder().decode(b64Compressed));        return new String(decompressedBArray, StandardCharsets.UTF_8);    }

}
