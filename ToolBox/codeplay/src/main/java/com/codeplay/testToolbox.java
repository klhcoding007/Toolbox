package com.codeplay;

import com.toolbox.StateHelper;
import com.toolbox.StringHelper;

public class testToolbox {

	public static void main(String[] args) {
	System.out.println(StateHelper.stateToAbbreviation("New Hampshire"));
	// don't need to instantiate an object if it is a static method.
		
//	String csz = "St. Louis  ,  New York   33333-2222";
//	String csz = "Louis,  Michigan   33333";
	String csz = "Louis ,  Michigan,   33333-8765";
	
	System.out.println(StringHelper.cszExtractCity(csz));
	System.out.println(StringHelper.cszExtractState(csz));
	System.out.println(StringHelper.cszExtractZipCode(csz));
	}

}
