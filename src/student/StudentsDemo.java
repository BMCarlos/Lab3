package student;

import java.util.Scanner;

public class StudentsDemo {
public static void main(String[] args) {
		
		System.out.println("What action would you like to implement? \n ");
		System.out.println("1: Show all Students \n");
		System.out.println("2: Add a Course \n");
		System.out.println("3: Drop a course \n");
		System.out.println("9: Quit \n");
		Scanner input = new Scanner(System.in);
		
		int choice = input.nextInt();
		
		
		//menu
		switch(choice) 
		{
		case 1: 
		break;
		
		case 2: 
		break;
		
		case 3: 
		break;
		
		case 9: 
		System.exit(0);
		}
	}
}
