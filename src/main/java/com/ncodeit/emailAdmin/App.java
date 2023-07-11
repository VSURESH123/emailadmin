package com.ncodeit.emailAdmin;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
   
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the Fname:  ");
	  String fname = sc.nextLine();
	  System.out.println("Enter the Lname:  ");
	  String lname = sc.nextLine();
	  
	  Email e = new Email(fname, lname);
	  e.info();
  }
}
