package emailapp;

import java.util.Scanner;

public class Email {
private String firstname;
private String lastname;
private String password;
private String department;
private String email;
private int mailboxCapacity=500;
private int defaultPasswordLength=10;
private String alternateEmail;
private String companySuffix="company.com";

public Email(String firstname, String lastname) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.department=setDepartment();
	this.password=randomPassword(8);
	System.out.println("Your password:" + this.password);
	email=firstname.toLowerCase() + lastname.toLowerCase()+ "@" + department + "." + companySuffix;
}

private String setDepartment(){
		 System.out.print("Department Codes:\n1 Sales\n2 Development\n3 Accounting\n0 none\n Enter the department code:");
		 Scanner in=new Scanner(System.in);
		 int depChoice=in.nextInt();
		 if(depChoice==1) {return "Sales";}
		 else if(depChoice==2) {return "Developer";}
		 else if(depChoice==3) {return "Accountant";}
		 else {return "";}
	 }

private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUWVXYZ0123456789!%&@£#$*?";
	char[] password=new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random()* passwordSet.length());
		password[1]=passwordSet.charAt(rand);
	}
	return new String(password);
}

public void setMailboxCapacity(int capacity) {
	this.mailboxCapacity=capacity;
}

public void setAlternateEmail(String altEmail) {
	this.alternateEmail= altEmail;
}

public void changePassword(String password) {
	this.password=password;
}

public int getMailboxCapacity(){return mailboxCapacity;}
public String getAlternateEmail() {return alternateEmail;}
public String getPassword() {return password;}
public String showInfo() {
	return "DISPLAY NAME: " + firstname + " " + lastname +
			"\nCOMPANY EMAIL:" + email +
			"\nMAILBOX CAPACITY:" + mailboxCapacity + "ab";
}
}
