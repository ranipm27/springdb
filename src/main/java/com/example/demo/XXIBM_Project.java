package com.example.demo;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class XXIBM_Project {
	
	@Id
	private String projectname;
	private String Projectid;
	private Date datestamp;
	private Time timestamp;
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectid() {
		return Projectid;
	}
	public void setProjectid(String projectid) {
		Projectid = projectid;
	}
	public Date getDatestamp() {
		return datestamp;
	}
	public void setDatestamp(Date datestamp) {
		this.datestamp = datestamp;
	}
	public Time getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Time timestamp) {
		this.timestamp = timestamp;
	}
	
	

		
	

}
