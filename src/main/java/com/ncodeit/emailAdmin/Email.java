package com.ncodeit.emailAdmin;

import java.util.Scanner;
//firstname.lastname@department.company.com
public class Email {
	private String fName;
	private String lName;

	private String dep;
	private String email;
	
	public Scanner s = new Scanner(System.in);
	
	public Email(String fName, String lName) {
//		super();
		this.fName = fName;
		this.lName = lName;
		this.dep = this.setDep();
		this.email = this.setemail();
	}
	

	private String setemail() {
		return this.fName.toLowerCase()+"."+this.lName.toLowerCase()+"@"+this.dep.toLowerCase()+".company.com";
	}

   
	private String setDep() {
		boolean f = false;
		   do {
		 System.out.print("Enter Dep code:  ");
		int c = s.nextInt();
		
		switch(c) {
			case 1 : 
				return "Sales";
				
			case 2 : 
				return "Developer";
			case 0 : 
				return "None";
			default :
				System.out.println("Invalid c");
		}
		   }
	while(!f);
		return null;
	
	}
	public void info() {
		System.out.println(this.email);
	}
	
}
