package ArrayListChallenge;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choice;
		String name;
		long phone;
		String key;
		MobilePhone myphone=new MobilePhone();
		Scanner c=new Scanner(System.in);
		boolean a=true;
		while(a) {
			System.out.println("Menu:");
			System.out.println("1. Print list of contacts.");
			System.out.println("2. Add new contact.");
			System.out.println("3. Update existing contact");
			System.out.println("4. Remove a contact");
			System.out.println("5. Search a contact");
			System.out.println("4. Quit");
			System.out.println("Enter your choice:");
			choice=c.nextInt();
			switch(choice) {
			case 1: myphone.printContacts();
		        	 System.out.println("Press any key to continue..");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			         break;
			case 2:System.out.println("Enter name:");
			       name=c.next();
			       System.out.println("Enter phone number:");
			       phone=c.nextLong();
			       Contacts contact=new Contacts(name,phone);
			       myphone.addContacts(contact);
			       System.out.println("Press any key to continue..");
			       try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			       break;
			case 3:System.out.println("Enter Contact name to be modified:");
			       name=c.next();
			       System.out.println("Enter new phone number:");
			       phone=c.nextLong();
			       Contacts contact1=new Contacts(name,phone);
			       myphone.updateContacts(contact1);
			       System.out.println("Press any key to continue..");
			       try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			       break;
			case 4:System.out.println("Enter Contact name to be removed:");
			       name=c.next();
			       myphone.removeContacts(name);
			       System.out.println("Press any key to continue..");
			       try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			       break;
			case 5: System.out.println("Enter Contact name to be searched:");
			         name=c.next();
			         myphone.searchContacts(name);
			         System.out.println("Press any key to continue..");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			         break;
			case 6:System.out.println("quitting....");
			       a=false;
			       break;
			default: System.out.println("Wrong choice..Enter again");
			}
			
		}

	}

}
