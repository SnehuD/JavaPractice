package problemStmts;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * how to compare string in java
		 * login system
		 * take u name & pwd from user
		 * if u name= admin & pwd = admin@123 then login successful
		 * else invalid cred
		 * 
		 * if login succ- enter ur role(mngr, devlpr)
		 * if mngr then access granted to te mngr dashboard
		 * if dev then access granted to te dev dashboard
		 * else
		 * unknown role
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//if(str1.equals(str2))
		
		System.out.println("Enter User Name : ");
		String name = sc.next();
		
		System.out.println("Enter your Password : ");
		String pwd = sc.next();
		
		if(name.equals("admin") && pwd.equals("admin@123")) {
			System.out.println("Login Successful");
			
			System.out.println("Enter your role : ");
			String role = sc.next();
			
			if(role.equals("manager")) {
				System.out.println("Access granted to the manager dashboard");
			}
			else if(role.equals("developer")) {
				System.out.println("Access granted to the developer dashboard");
			}
			else {
				System.out.println("Unknown role");
			}
			
		} else {
			System.out.println("Invalid Credentials");
		}
		
		sc.close();

	}

}
