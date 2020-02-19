package com.epam;

import java.lang.Math;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Simple_Compound_Interest {
	public static void calculateInterest()
	{
		Scanner sc=new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println("Enter the principle amount :");
		try {
			double princpleamount=sc.nextDouble();
			p.println("Enter the time period :");
			double timeperiod=sc.nextDouble();
			p.println("Enter the rate of interest per annum :");
			double rateofinterest=sc.nextDouble();
			p.println("Simple Interest is :"+(princpleamount*timeperiod*rateofinterest)/100);
			p.println("Compound Interest is :"+((princpleamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpleamount));
			} catch (Exception e) {
				p.println("Enter a valid input ... ");
				}
		}
	}