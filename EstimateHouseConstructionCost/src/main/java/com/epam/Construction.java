package com.epam;

import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Construction {
	public static void calculateCost() {
		Scanner sc= new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println();
		p.println("CONSTRUCTION COST ESTIMATION");
		p.println();
		p.println("Variants Available");
		p.println("1. Construction with standard materials");
		p.println("2. Construction with above standard materials");
		p.println("3. Construction with high standard materials");
		p.println("4. Construction with high standard materials and fully automated");
		p.println("Enter your choice (1-4): ");
		try {
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		p.println("Enter the area of house: ");
		p.println("Cost ="+sc.nextDouble()*1200 +" INR");
		break;
		case 2:
		p.println("Enter the area of house: ");
		p.println("Cost ="+sc.nextDouble()*1500 +" INR");
		break;
		case 3:
		p.println("Enter the area of house: ");
		p.println("Cost ="+sc.nextDouble()*1800 +" INR");
		break;
		case 4:
		p.println("Enter the area of house: ");
		p.println("Cost ="+sc.nextDouble()*2500 +" INR");
		break;
		default:
		p.println("Enter a valid input ... ");

		}}

		catch (Exception e) {

		p.println("Enter a valid input ... ");

		}
		sc.close();
		}
		}