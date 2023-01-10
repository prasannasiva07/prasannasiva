package org.currentyear;

import java.util.LinkedList;
import java.util.List;

public class sample3 {
	public static void main(String[] args) {
		List<Integer> s= new LinkedList<Integer>();
		s.add(19);
		s.add(20);
		s.add(22);
		s.add(33);
		System.out.println(s);
		int ss = s.size();
		System.out.println(ss);
		s.remove(3);
		System.out.println(s);
		
		
		
		List<Integer> s1= new LinkedList<Integer>();
		s1.add(19);
		s1.add(20);
		s1.add(22);
		s1.add(33);
		System.out.println(s1);
		s1.removeAll(s);
		System.out.println(s1);
	}

}
 