package pe.edu.unsch.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder a = new  BCryptPasswordEncoder();
		System.out.println(a.encode("bachiller"));
	}

}
