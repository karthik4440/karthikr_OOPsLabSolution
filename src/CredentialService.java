import java.security.SecureRandom;

public class CredentialService {
	
	String mailAddress;
	String password;
	static String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890@#$%^&*()";
	static SecureRandom rnd= new SecureRandom();
	Employee employee;
	
	CredentialService(Employee employee){
		this.employee=employee;
	}
	public void generatePassword(int length){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<length;i++) {
			sb.append(alphanumeric.charAt(rnd.nextInt(alphanumeric.length())));
		}
		this.password=sb.toString();
	}
	
	public void generateEmailAddress(String Department) {
		this.mailAddress=employee.FirstName+employee.LastName+"@"+Department+".abc.com";
	}
	
	public void showCredentials() {
		System.out.println("Dear "+ employee.FirstName+", your generated credentails are as follows");
		System.out.println("Email    ---> "+this.mailAddress);
		System.out.println("Password ---> "+this.password);
	}
	
	
}
