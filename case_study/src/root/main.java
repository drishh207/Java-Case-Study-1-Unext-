package root;
import java.util.*;

public class main {
	Scanner scan = new Scanner(System.in);
	
	void displayDonationDetails() {
		donor obj = new donor();
		System.out.println("Donation Details:");
		System.out.println("Enter name:");
		obj.setName(scan.nextLine());
		System.out.println("Enter Date of Birth (dd-MM-YYYY format):");
		obj.setDateOfBirth(scan.nextLine());
		System.out.println("Enter Gender:");
		obj.setGender(scan.nextLine());
		System.out.println("Enter Mobile number:");
		obj.setMobileNumber(scan.nextLine());
		System.out.println("Enter Blood Group:");
		obj.setBloodGroup(scan.nextLine());
		System.out.println("Enter Blood Bank name:");
		obj.setBloodBankName(scan.nextLine());
		System.out.println("Enter Donor Type:");
		obj.setDonorType(scan.nextLine());
		System.out.println("Enter Donation Date (dd-MM-YYYY format):");
		obj.setDonationDate(scan.nextLine());
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Date of Birth: " + obj.getDateOfBirth());
		System.out.println("Gender: " + obj.getGender());
		System.out.println("Mobile number: " + obj.getMobileNumber());
		System.out.println("Blood Group: " + obj.getBloodGroup());
		System.out.println("Blood Bank Name: " + obj.getBloodBankName());
		System.out.println("Donor Type: " + obj.getDonorType());
		System.out.println("Donation Date: " + obj.getDonationDate());
		
	}
	

	public static void main(String[] args) {
		main obj = new main();
		obj.displayDonationDetails();
	}

}
