package com.fellowship.addressbook;
import java.util.*;

public class AdressBook {
	
	List<ContactInfo> addressBook = new ArrayList<>();
	
	public void add(ContactInfo info) {
		addressBook.add(info);
	}
	
	public List<ContactInfo> display() {
		return addressBook;
		
	}
}
