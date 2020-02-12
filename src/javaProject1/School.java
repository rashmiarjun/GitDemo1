package javaProject1;

import java.util.Scanner;
import java.util.TreeSet;



public class School {
	
		public static void main(String[] args) 
		{
			TreeSet<Student> ts=new TreeSet<Student>();
			
			ts.add(new Student(10,"Rashmi",65));
			ts.add(new Student(8,"Chinni",70));
			ts.add(new Student(2,"Rakshit",50));
			System.out.println(ts);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data");
			int a=sc.nextInt();
			/*switch(a)
			{
			Case 1: 
			}*/
			
		}

	}



