package com.iot.utils;

public class Student {
	
	private String stdId;
	private String stdName;
	private String stdAddress;
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Student(String stdId, String stdName, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}

	
	
	  
	
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdAddress == null) ? 0 : stdAddress.hashCode());
		result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stdAddress == null) {
			if (other.stdAddress != null)
				return false;
		} else if (!stdAddress.equals(other.stdAddress))
			return false;
		if (stdId == null) {
			if (other.stdId != null)
				return false;
		} else if (!stdId.equals(other.stdId))
			return false;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		return true;
	}
	@Override
	  
	  public String toString() {
	  
	  return this.stdId + " " + this.stdName + " " + this.stdAddress; }
	 
	 

}
