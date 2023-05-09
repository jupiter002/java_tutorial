package quiz;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWeightTest {
	public static void main(String[] args) {
		File dir = new File("C:\\");
		File[] subFiles = dir.listFiles();
		long bigSize = 0;
		File bigFile = null;
		
		
		
		for(int i=0; i<subFiles.length; i++) {
			File tempFile = subFiles[i];
//			System.out.println(tempFile.getName()); 
			if(tempFile.isDirectory())continue;
			long fileSizebyte = tempFile.length();	// byte 단위
			long fileSizekb = fileSizebyte/1024;	// kilobyte 단위
			long fileSizemb = fileSizekb/1024;	// megabyte 단위
			
			if(fileSizemb > bigSize) {
				bigSize = fileSizemb;
				bigFile = tempFile;
			}
		}System.out.println("가장 큰 파일은 "+bigFile+"이고 용량은"+bigSize+"MB입니다. 경로는 "+bigFile.getPath()+"입니다");
		
		
	}
}
