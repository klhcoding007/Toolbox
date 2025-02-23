package com.toolbox;

public class StateHelper {

// Constructors
	public StateHelper() {
		super();
	}

// Methods
	public static Boolean stateToAbbreviationFound(String state) {
		if (stateToAbbreviation(state).equalsIgnoreCase("NOT FOUND")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	public static String stateToAbbreviation(String state) {
		if (state == null || state.isEmpty()) {
			state = "NOT FOUND";
		}

		return switch (state.toUpperCase()) {
		case "ALABAMA" -> "AL";
		case "ALASKA" -> "AK";
		case "ARIZONA" -> "AZ";
		case "ARKANSAS" -> "AR";
		case "CALIFORNIA" -> "CA";
		case "COLORADO" -> "CO";
		case "CONNECTICUT" -> "CT";
		case "DELAWARE" -> "DE";
		case "FLORIDA" -> "FL";
		case "GEORGIA" -> "GA";
		case "HAWAII" -> "HI";
		case "IDAHO" -> "ID";
		case "ILLINOIS" -> "IL";
		case "INDIANA" -> "IN";
		case "IOWA" -> "IA";
		case "KANSAS" -> "KS";
		case "KENTUCKY" -> "KY";
		case "LOUISIANA" -> "LA";
		case "MAINE" -> "ME";
		case "MARYLAND" -> "MD";
		case "MASSACHUSETTS" -> "MA";
		case "MICHIGAN" -> "MI";
		case "MINNESOTA" -> "MN";
		case "MISSISSIPPI" -> "MS";
		case "MISSOURI" -> "MO";
		case "MONTANA" -> "MT";
		case "NEBRASKA" -> "NE";
		case "NEVADA" -> "NV";
		case "NEW HAMPSHIRE" -> "NH";
		case "NEW JERSEY" -> "NJ";
		case "NEW MEXICO" -> "NM";
		case "NEW YORK" -> "NY";
		case "NORTH CAROLINA" -> "NC";
		case "NORTH DAKOTA" -> "ND";
		case "OHIO" -> "OH";
		case "OKLAHOMA" -> "OK";
		case "OREGON" -> "OR";
		case "PENNSYLVANIA" -> "PA";
		case "RHODE ISLAND" -> "RI";
		case "SOUTH CAROLINA" -> "SC";
		case "SOUTH DAKOTA" -> "SD";
		case "TENNESSEE" -> "TN";
		case "TEXAS" -> "TX";
		case "UTAH" -> "UT";
		case "VERMONT" -> "VT";
		case "VIRGINIA" -> "VA";
		case "WASHINGTON" -> "WA";
		case "WEST VIRGINIA" -> "WV";
		case "WISCONSIN" -> "WI";
		case "WYOMING" -> "WY";
		default -> "NOT FOUND";
		};

	}

	public static String abbreviationToState(String abbreviation) {
		if (abbreviation == null || abbreviation.isEmpty()) {
			return "UNKNOWN";
		}

		return switch (abbreviation.toUpperCase()) {
		case "AL" -> "ALABAMA";
		case "AK" -> "ALASKA";
		case "AZ" -> "ARIZONA";
		case "AR" -> "ARKANSAS";
		case "CA" -> "CALIFORNIA";
		case "CO" -> "COLORADO";
		case "CT" -> "CONNECTICUT";
		case "DE" -> "DELAWARE";
		case "FL" -> "FLORIDA";
		case "GA" -> "GEORGIA";
		case "HI" -> "HAWAII";
		case "ID" -> "IDAHO";
		case "IL" -> "ILLINOIS";
		case "IN" -> "INDIANA";
		case "IA" -> "IOWA";
		case "KS" -> "KANSAS";
		case "KY" -> "KENTUCKY";
		case "LA" -> "LOUISIANA";
		case "ME" -> "MAINE";
		case "MD" -> "MARYLAND";
		case "MA" -> "MASSACHUSETTS";
		case "MI" -> "MICHIGAN";
		case "MN" -> "MINNESOTA";
		case "MS" -> "MISSISSIPPI";
		case "MO" -> "MISSOURI";
		case "MT" -> "MONTANA";
		case "NE" -> "NEBRASKA";
		case "NV" -> "NEVADA";
		case "NH" -> "NEW HAMPSHIRE";
		case "NJ" -> "NEW JERSEY";
		case "NM" -> "NEW MEXICO";
		case "NY" -> "NEW YORK";
		case "NC" -> "NORTH CAROLINA";
		case "ND" -> "NORTH DAKOTA";
		case "OH" -> "OHIO";
		case "OK" -> "OKLAHOMA";
		case "OR" -> "OREGON";
		case "PA" -> "PENNSYLVANIA";
		case "RI" -> "RHODE ISLAND";
		case "SC" -> "SOUTH CAROLINA";
		case "SD" -> "SOUTH DAKOTA";
		case "TN" -> "TENNESSEE";
		case "TX" -> "TEXAS";
		case "UT" -> "UTAH";
		case "VT" -> "VERMONT";
		case "VA" -> "VIRGINIA";
		case "WA" -> "WASHINGTON";
		case "WV" -> "WEST VIRGINIA";
		case "WI" -> "WISCONSIN";
		case "WY" -> "WYOMING";
		default -> "UNKNOWN";
		};
	}

}
