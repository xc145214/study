package com;

public class Emp {

	String empno;
	String mgr;
	String comm;
	String deptno;
	String sal;
	String ename;
	String job;
	String hireDate;



	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", mgr=" + mgr + ", comm=" + comm
				+ ", deptno=" + deptno + ", sal=" + sal + ", ename=" + ename
				+ ", job=" + job + ", hireDate=" + hireDate + "]";
	}





}
