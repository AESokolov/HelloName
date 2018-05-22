package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		Name firstName = new Name();
		String myName = firstName.getName("Andrey");
		System.out.println(myName);

	}

}
