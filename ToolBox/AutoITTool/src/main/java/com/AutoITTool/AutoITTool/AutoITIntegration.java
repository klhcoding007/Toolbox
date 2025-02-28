package com.AutoITTool.AutoITTool;

import java.io.File;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutoITIntegration {
	public static void main(String[] args) {
		try {
			System.setProperty(LibraryLoader.JACOB_DLL_PATH, new File("lib/jacob-1.18-x64.dll").getAbsolutePath());
			System.out.println("AutoIT DLL registered successfully!");

			// Initialize AutoItX
	        AutoItX autoIt = new AutoItX();
	        
			// Execute the AutoIT script
//			Runtime.getRuntime().exec("src/main/resources/ChromePDF.exe");
//			System.out.println("AutoIT script executed successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
