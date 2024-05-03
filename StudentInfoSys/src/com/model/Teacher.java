package com.model;

public class Teacher {
private int tId;
private String fName;
private String lName;
private String eMail;
public Teacher(int tId, String fName, String lName, String eMail) {
	super();
	this.tId = tId;
	this.fName = fName;
	this.lName = lName;
	this.eMail = eMail;
}
public Teacher() {
	super();
}
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
@Override
public String toString() {
	return "Teacher [tId=" + tId + ", fName=" + fName + ", lName=" + lName + ", eMail=" + eMail + "]";
}

}


