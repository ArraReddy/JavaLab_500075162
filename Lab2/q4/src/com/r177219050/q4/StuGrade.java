package com.r177219050.q4;

import java.util.Scanner;

import java.util.Arrays;

public class StuGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		
		int marks[]=new int[10];
		String grades[]=new String[10];
		
		System.out.println("Enter student marks:");
		for(int i=0;i<10;i++)
		{
			marks[i]=s.nextInt();
			
		}
		
		Arrays.sort(marks);
		
		for(int i=0;i<10;i++)
		{
			if(marks[i]>=40 && marks[i]<50)
			{
				grades[i]="PASS";
			}
			else if(marks[i]>=51 && marks[i]<75)
			{
				grades[i]="MERIT";
			}
			else if(marks[i]>=75)
			{
				grades[i]="DISTINCTION";
			}
			else
			{
				grades[i]="FAIL";
			}
			
		}
		
		System.out.println("marks           grades");
		for(int i=0;i<10;i++)
		{
			System.out.printf(marks[i]+"		"+grades[i]+"\n");
		}
		
		
// tyring git update	
		
		

	}

}


//update 2 git