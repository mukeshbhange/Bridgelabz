package com.fellowship.addressbook;
import java.util.*;

public class AddressBookView {
	
	Scanner sc = new Scanner(System.in);

	public int getUserChoice() {
		System.out.println("1.Add Contact Info \n2.Diaplay Adress Book\n3.Exit");
		int input = sc.nextInt();
		return input;	
	}
	

	public ContactInfo addContactInfo() {
		System.out.println(" Enter first name");
		String fname = sc.next();
		System.out.println(" Enter last name");
		String lname = sc.next();
		System.out.println(" Enter address");
		String address = sc.next();
		System.out.println(" Enter city name");
		String city = sc.next();
		System.out.println(" Enter state name");
		String state = sc.next();
		System.out.println(" Enter Zip Code");
		String zip = sc.next();
		System.out.println(" Enter phone number");
		String phone = sc.next();
		System.out.println(" Enter email");
		String email = sc.next();
		
		return new ContactInfo(fname,lname,address,city,state,zip,phone,email);
	}
	
	public void displayAddedContact(ContactInfo info) {
		System.out.println("Added Contact Info: ");
		System.out.println(info);
		
	}
}
