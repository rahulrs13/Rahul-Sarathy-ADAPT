package com.jpa;

import org.springframework.data.annotation.Id;

public class employee {

	@Id
	private long empid;
	private String empName,empdep,empdesg;
	private int empsalary;
	public employee(long empid, String empName, String empdep, String empdesg, int empsalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empdep = empdep;
		this.empdesg = empdesg;
		this.empsalary = empsalary;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpdep() {
		return empdep;
	}
	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}
	public String getEmpdesg() {
		return empdesg;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empName=" + empName + ", empdep=" + empdep + ", empdesg=" + empdesg
				+ ", empsalary=" + empsalary + "]";
	}
	
}
