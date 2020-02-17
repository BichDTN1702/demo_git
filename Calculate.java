package com.tsdv.ComplexNumber.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.tsdv.ComplexNumber.entity.ComplexNumber;

public class Calculate {

	static Scanner input = new Scanner(System.in);
	ComplexNumber complexNumber = new ComplexNumber();
	ArrayList<ComplexNumber> arrayListComNumb = new ArrayList<ComplexNumber>();

	public static ComplexNumber inputNumb() {
		System.out.print("Enter the complex number real : ");
		double real = input.nextDouble();
		System.out.print("Enter the complex number real imaginary : ");
		double imaginary = input.nextDouble();
		return new ComplexNumber(real, imaginary);
	}

	public static void displayNumb(ComplexNumber complexNumber) {
		complexNumber.showComNumb();
	}

	public static ComplexNumber additionNumb(ComplexNumber numb1, ComplexNumber numb2) {
		
		System.out.println("Enter the complex number 1 ");
		System.out.print("Enter the complex number real : ");
		double realNumb1 = input.nextDouble();
		System.out.print("Enter the complex number real imaginary : ");
		double imagNumb1 = input.nextDouble();
		System.out.println("Complex number just entered is : " + realNumb1 + " + " + imagNumb1 + "i");
		
		System.out.println("Enter the complex number 2 ");
		System.out.print("Enter the complex number real : ");
		double realNumb2 = input.nextDouble();
		System.out.print("Enter the complex number real imaginary : ");
		double imagNumb2 = input.nextDouble();
		System.out.println("Complex number just entered is : " + realNumb2 + " + " + imagNumb2 + "i");
		// Sum two complex numbers
		// real part plus real part
		// imaginary part plus
		double real       = numb1.getReal() + numb2.getReal();
		double imaginary  = numb1.getImaginary() + numb2.getImaginary();
		ComplexNumber sum = new ComplexNumber(real, imaginary);
		return sum;
		
	}
	
	public static void multi(ComplexNumber numb1, ComplexNumber numb2) {
		System.out.println("Enter the complex number 1 ");
		System.out.print("Enter the complex number real : ");
		double realNumb1 = input.nextDouble();
		System.out.print("Enter the complex number real imaginary : ");
		double imagNumb1 = input.nextDouble();
		System.out.println("Complex number just entered is : " + realNumb1 + " + " + imagNumb1 + "i");
		
		System.out.println("Enter the complex number 2 ");
		System.out.print("Enter the complex number real : ");
		double realNumb2 = input.nextDouble();
		System.out.print("Enter the complex number real imaginary : ");
		double imagNumb2 = input.nextDouble();
		System.out.println("Complex number just entered is : " + realNumb2 + " + " + imagNumb2 + "i");
		// Sum two complex numbers
		// real part plus real part
		// imaginary part plus
		ComplexNumber sum = new ComplexNumber(0,0);
		double real = realNumb1 - realNumb2;
		
		return ;
	}
}
