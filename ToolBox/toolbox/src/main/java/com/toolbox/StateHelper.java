package com.toolbox;

public class StateHelper {

	public static String stateToAbbreviation(String state) {
		String abbreviation;
		if (state == null || state.isEmpty()) {
			state = "";
		}

		switch (state.toUpperCase()) {
		case "ALABAMA":
			abbreviation = "AL";
			break;
		case "ALASKA":
			abbreviation = "AK";
			break;
		case "ARIZONA":
			abbreviation = "AZ";
			break;
		case "ARKANSAS":
			abbreviation = "AR";
			break;
		case "CALIFORNIA":
			abbreviation = "CA";
			break;
		case "COLORADO":
			abbreviation = "CO";
			break;
		case "CONNECTICUT":
			abbreviation = "CT";
			break;
		case "DELAWARE":
			abbreviation = "DE";
			break;
		case "FLORIDA":
			abbreviation = "FL";
			break;
		case "GEORGIA":
			abbreviation = "GA";
			break;
		case "HAWAII":
			abbreviation = "HI";
			break;
		case "IDAHO":
			abbreviation = "ID";
			break;
		case "ILLINOIS":
			abbreviation = "IL";
			break;
		case "INDIANA":
			abbreviation = "IN";
			break;
		case "IOWA":
			abbreviation = "IA";
			break;
		case "KANSAS":
			abbreviation = "KS";
			break;
		case "KENTUCKY":
			abbreviation = "KY";
			break;
		case "LOUISIANA":
			abbreviation = "LA";
			break;
		case "MAINE":
			abbreviation = "ME";
			break;
		case "MARYLAND":
			abbreviation = "MD";
			break;
		case "MASSACHUSETTS":
			abbreviation = "MA";
			break;
		case "MICHIGAN":
			abbreviation = "MI";
			break;
		case "MINNESOTA":
			abbreviation = "MN";
			break;
		case "MISSISSIPPI":
			abbreviation = "MS";
			break;
		case "MISSOURI":
			abbreviation = "MO";
			break;
		case "MONTANA":
			abbreviation = "MT";
			break;
		case "NEBRASKA":
			abbreviation = "NE";
			break;
		case "NEVADA":
			abbreviation = "NV";
			break;
		case "NEW HAMPSHIRE":
			abbreviation = "NH";
			break;
		case "NEW JERSEY":
			abbreviation = "NJ";
			break;
		case "NEW MEXICO":
			abbreviation = "NM";
			break;
		case "NEW YORK":
			abbreviation = "NY";
			break;
		case "NORTH CAROLINA":
			abbreviation = "NC";
			break;
		case "NORTH DAKOTA":
			abbreviation = "ND";
			break;
		case "OHIO":
			abbreviation = "OH";
			break;
		case "OKLAHOMA":
			abbreviation = "OK";
			break;
		case "OREGON":
			abbreviation = "OR";
			break;
		case "PENNSYLVANIA":
			abbreviation = "PA";
			break;
		case "RHODE ISLAND":
			abbreviation = "RI";
			break;
		case "SOUTH CAROLINA":
			abbreviation = "SC";
			break;
		case "SOUTH DAKOTA":
			abbreviation = "SD";
			break;
		case "TENNESSEE":
			abbreviation = "TN";
			break;
		case "TEXAS":
			abbreviation = "TX";
			break;
		case "UTAH":
			abbreviation = "UT";
			break;
		case "VERMONT":
			abbreviation = "VT";
			break;
		case "VIRGINIA":
			abbreviation = "VA";
			break;
		case "WASHINGTON":
			abbreviation = "WA";
			break;
		case "WEST VIRGINIA":
			abbreviation = "WV";
			break;
		case "WISCONSIN":
			abbreviation = "WI";
			break;
		case "WYOMING":
			abbreviation = "WY";
			break;
		default:
			abbreviation = "not found";
		}

		return abbreviation.toUpperCase();
	}

	public static String AbbreviationToState(String abbreviation) {
		if (abbreviation == null || abbreviation.isEmpty()) {
			abbreviation = "";
		}

		String stateName;

		switch (abbreviation.toUpperCase()) {
		case "AL":
			stateName = "ALABAMA";
			break;
		case "AK":
			stateName = "ALASKA";
			break;
		case "AZ":
			stateName = "ARIZONA";
			break;
		case "AR":
			stateName = "ARKANSAS";
			break;
		case "CA":
			stateName = "CALIFORNIA";
			break;
		case "CO":
			stateName = "COLORADO";
			break;
		case "CT":
			stateName = "CONNECTICUT";
			break;
		case "DE":
			stateName = "DELAWARE";
			break;
		case "FL":
			stateName = "FLORIDA";
			break;
		case "GA":
			stateName = "GEORGIA";
			break;
		case "HI":
			stateName = "HAWAII";
			break;
		case "ID":
			stateName = "IDAHO";
			break;
		case "IL":
			stateName = "ILLINOIS";
			break;
		case "IN":
			stateName = "INDIANA";
			break;
		case "IA":
			stateName = "IOWA";
			break;
		case "KS":
			stateName = "KANSAS";
			break;
		case "KY":
			stateName = "KENTUCKY";
			break;
		case "LA":
			stateName = "LOUISIANA";
			break;
		case "ME":
			stateName = "MAINE";
			break;
		case "MD":
			stateName = "MARYLAND";
			break;
		case "MA":
			stateName = "MASSACHUSETTS";
			break;
		case "MI":
			stateName = "MICHIGAN";
			break;
		case "MN":
			stateName = "MINNESOTA";
			break;
		case "MS":
			stateName = "MISSISSIPPI";
			break;
		case "MO":
			stateName = "MISSOURI";
			break;
		case "MT":
			stateName = "MONTANA";
			break;
		case "NE":
			stateName = "NEBRASKA";
			break;
		case "NV":
			stateName = "NEVADA";
			break;
		case "NH":
			stateName = "NEW HAMPSHIRE";
			break;
		case "NJ":
			stateName = "NEW JERSEY";
			break;
		case "NM":
			stateName = "NEW MEXICO";
			break;
		case "NY":
			stateName = "NEW YORK";
			break;
		case "NC":
			stateName = "NORTH CAROLINA";
			break;
		case "ND":
			stateName = "NORTH DAKOTA";
			break;
		case "OH":
			stateName = "OHIO";
			break;
		case "OK":
			stateName = "OKLAHOMA";
			break;
		case "OR":
			stateName = "OREGON";
			break;
		case "PA":
			stateName = "PENNSYLVANIA";
			break;
		case "RI":
			stateName = "RHODE ISLAND";
			break;
		case "SC":
			stateName = "SOUTH CAROLINA";
			break;
		case "SD":
			stateName = "SOUTH DAKOTA";
			break;
		case "TN":
			stateName = "TENNESSEE";
			break;
		case "TX":
			stateName = "TEXAS";
			break;
		case "UT":
			stateName = "UTAH";
			break;
		case "VT":
			stateName = "VERMONT";
			break;
		case "VA":
			stateName = "VIRGINIA";
			break;
		case "WA":
			stateName = "WASHINGTON";
			break;
		case "WV":
			stateName = "WEST VIRGINIA";
			break;
		case "WI":
			stateName = "WISCONSIN";
			break;
		case "WY":
			stateName = "WYOMING";
			break;
		default:
			stateName = "UNKNOWN";
		}

		return stateName.toUpperCase();
	}

}
