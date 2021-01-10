package com.personal.api.complaintLog.ComplainLoggerAPI.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

	public static String createComplaintID(String userID){
		StringBuilder sb = new StringBuilder();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		
		sb.append(userID).append("_").append(sdf.format(new Date()));
		
		return sb.toString();
	}
	
}



