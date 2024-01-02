package com.advanceexample;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
  private int rno;
  private List<String> course;
  private Map<Integer,String> mp;
  private Student(int rno,List<String> course)
  {
	  this.rno=rno;
	  this.course=course;
  }
  private Student(Map<Integer,String> mp)
  {
	  this.mp=mp;
  }
  void displayIno()
  {
	  System.out.println("rno is "+rno);
	  Iterator it = course.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
  }
  void displayMapInfo()
  {
	  Set<Map.Entry<Integer,String>> se = mp.entrySet();
	  for(Map.Entry<Integer,String> me:se)
	  {
		  System.out.println(me.getKey() + "," + me.getValue());
	  }
  }
}
