package com;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {

//		double marks[] = { 35.00, 67.78, 45.67 };
//		for(double x: marks) {
//			System.out.println(x);

//		String name[] = { "chandra", "raju", "ravi" };
//
//		for (String i : name) {
//			System.out.println(i);

			ArrayList<String> l = new ArrayList<>();
			l.add("akhil");
			l.add("Cheenu");
			l.add("Shruthi");
			l.add("Anachal");
			l.add("Priyanka");
//			for (String k : l) {
//				System.out.println(k);
//			}
			//Lambda using java 8
			l.forEach((k)->System.out.println(k));;
			
			//Reference method by using java 8
//			l.forEach(System.out::println);

		
		}
//	}

}
