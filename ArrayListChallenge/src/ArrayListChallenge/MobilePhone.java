package ArrayListChallenge;
import java.util.ArrayList;

public class MobilePhone {
 private ArrayList<Contacts> contactlist=new ArrayList<Contacts>();
 public void printContacts() {
	 for (int i=0;i< contactlist.size();i++){
		 System.out.println((i+1) + ". " +contactlist.get(i).getName()+" "+contactlist.get(i).getPhoneNumber());
	 }
 }
 public void addContacts(Contacts contact) {
	 boolean contactexists=false;
	    for (int i=0;i< contactlist.size();i++){
	    	if (contactlist.get(i).getName().equals(contact.getName())) {
	    		System.out.println("Contact already exists");
	    		contactexists=true;
	    		break;
	    	}
	    }
	   if (!contactexists) {
		   contactlist.add(contact);
		   System.out.println(contact.getName()+" added successfully.");
	   }

 }
 public void updateContacts(Contacts contact) {
	 boolean contactexists=false;
	    for (Contacts c: contactlist){
	    	if (c.getName().equals(contact.getName())) {
	    		c.setPhoneNumber(contact.getPhoneNumber());
	    		contactexists=true;
	    		break;
	    	}
	    }
	   if (contactexists) {
		   System.out.println(contact.getName()+" phone no updated successfully.");
	   }
	   else {
		   System.out.println("Contact doesnt exist in the phone");
	   }

 }
 public void removeContacts(String contact) {
	 boolean contactexists=false;
	    for (Contacts c: contactlist){
	    	System.out.println(c.getName());
	    	if (c.getName().equals(contact)) {
	    		contactlist.remove(c);
	    		contactexists=true;
	    		break;
	    	}
	    }
	   if (contactexists) {
		   System.out.println(contact+" removed successfully.");
	   }
	   else {
		   System.out.println("Contact doesnt exist in the phone");
	   }
		
	
 }
 public void searchContacts(String contact) {
	 boolean contactexists=false;
	    for (Contacts c: contactlist){
	    	if (c.getName().equals(contact)) {
	    		System.out.println("Phone no for "+contact+"is:"+c.getPhoneNumber());
	    		contactexists=true;
	    		break;
	    	}
	    }
	   if (!contactexists) {
		   System.out.println("Contact doesnt exist in the phone");
	   }
	}
}
