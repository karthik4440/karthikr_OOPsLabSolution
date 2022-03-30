import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;
		String department = "", FirstName, LastName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		FirstName = sc.nextLine();
		System.out.println("Enter Second Name :");
		LastName = sc.nextLine();
		System.out.println(
				"Please enter the department from the following\n 1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");

		System.out.println();
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			department = "tech";
			break;

		case 2:
			department = "admin";
			break;

		case 3:
			department = "hr";
			break;

		case 4:
			department = "legal";
			break;

		default:
			System.out.println("Invalid choice. Enter a valid no.");
			sc.close();
			return;
		}

		sc.close();

		if (department != "") {
			Employee emp = new Employee(FirstName, LastName);

			CredentialService cred = new CredentialService(emp);
			cred.generateEmailAddress(department);
			cred.generatePassword(10);
			cred.showCredentials();
		}

	}

}
