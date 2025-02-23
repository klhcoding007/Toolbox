package com.toolbox;

import java.util.regex.Pattern;

// Example:  St. Louis  ,  New York   33333-2222

public class StringHelper {

	// Variables
	private static final Pattern DELIMITER_PATTERN = Pattern.compile("[,;:\\s]+");

	// Constructors
	public StringHelper() {
		super();
	}

	// Methods
	public static String cszExtractCity(String input) {
		String city = "";
		if (input == null || input.isEmpty()) {
			city = "CITY UNKNOWN";
		}

		// replace any double space with single
		input = input.replaceAll("\s{3,}", " ");
		input = input.replaceAll("\s{2,}", " ");

		// take off zip code
		input = input.replace(cszExtractZipCode(input), "");

		// take off state
		input = input.replace(cszExtractState(input), "");

		// city should be all that's left
		city = input.trim().replaceAll(",","").trim();

		return city;
	}

	public static String cszExtractState(String input) {
		String state = "";

		if (input == null || input.isEmpty()) {
			return "";
		}

		// replace any double space with single
		input = input.replaceAll("\s{3,}", " ");
		input = input.replaceAll("\s{2,}", " ");

		// take off zip code
		input = input.replace(cszExtractZipCode(input), "");

		String[] parts = DELIMITER_PATTERN.split(input.trim());
		if (parts.length < 2) {
			return "";
		}

		String statePart1 = parts[parts.length - 1].trim();
		String statePart2 = parts[parts.length - 2].trim();

		if (StateHelper.stateToAbbreviationFound(statePart1)) {
			state = statePart1;
		} else if (StateHelper.stateToAbbreviationFound(statePart2 + " " + statePart1)) {
			state = statePart2 + " " + statePart1;
		} else {
			state = "NOT FOUND";
		}
		return state;
	}

	public static String cszExtractZipCode(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		String[] parts = DELIMITER_PATTERN.split(input.trim());
		if (parts.length < 2) {
			return "";
		}
		String zipcode = parts[parts.length - 1];
		zipcode = zipcode.replace("-","");
		if (containsOnlyNumbers(zipcode)) {
			zipcode=parts[parts.length-1];
		} else {
			zipcode="";
		}
		
		return zipcode;
	}
	
	
	public static boolean containsOnlyNumbers(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
