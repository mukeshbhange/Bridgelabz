package com.fellowship.addressbook;

public class AdressBookController {
	public static void main(String args[]) {
		AdressBook adressbook = new AdressBook();
		AddressBookView view = new AddressBookView();


		boolean flag = true;
		do {
			int choice = view.getUserChoice();
			//view.addContactInfo();

			switch(choice) {
			case 1:
				ContactInfo info = view.addContactInfo();
				adressbook.add(info);
				view.displayAddedContact(info);
				break;
			case 2:
				//ContactInfo  adressbook.display() = adressbook.display();
				System.out.println( adressbook.display());
				break;
			case 3:
				System.exit(0);
				flag = false;
			}

		}while(flag);


	}

}
