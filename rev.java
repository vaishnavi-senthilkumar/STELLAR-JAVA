package com.steller;
import java.util.*;
import java.util.Scanner;
public class Day3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		for( i=0;i<n;i++){
			a[i]=sc.nextInt();	
		}
		int rn=0;
		for(i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					rn=a[i];
					break;
				}
			}
			if(rn!=0)
				break;
		}
		if(rn!=0) 
			System.out.println(a[i]);
		else
			System.out.println("no elements");
		}
	} 
