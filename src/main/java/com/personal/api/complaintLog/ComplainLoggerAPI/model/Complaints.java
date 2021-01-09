package com.personal.api.complaintLog.ComplainLoggerAPI.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="complaints")
public class Complaints {
	
	@Id
	private ObjectId _id;
	
	private String userName;
	
	private String date;
	
	private String location;
	
	private String deviceType;
	
	private String complaint;
	
	private String systemLog;
	

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String get_id() {
		return _id.toHexString();
	}
	

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getSystemLog() {
		return systemLog;
	}

	public void setSystemLog(String systemLog) {
		this.systemLog = systemLog;
	}
	
	

}