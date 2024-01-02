package com.kangaroo.springcoreapplication;

public class Student {
	private int rno;
	private String sname;
	private Student(int rno,String sname)
	{
		this.rno=rno;
		this.sname=sname;
	}
	public String toString()
	{
		return "rno is "+rno+ " sname is "+sname;
	}
	/*public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}*/
	

}
