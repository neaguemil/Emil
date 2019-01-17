package project.core.keyboard;

import java.util.Scanner;

public class Keyboard {
	private Scanner kb = new Scanner(System.in);
	
	private static Keyboard instance = new Keyboard();
	
	public static Keyboard getInstance() {
		return instance;
	}
	
	public String getText() {
		return kb.nextLine();
	}
	
	public int getInt(String message) {
		System.out.println(message);
		int value = kb.nextInt();
		return value;
	}
	

}
