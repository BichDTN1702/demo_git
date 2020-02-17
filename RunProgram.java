package com.tsdv.ComplexNumber.main;

import java.util.Scanner;

import com.tsdv.ComplexNumber.entity.ComplexNumber;
import com.tsdv.ComplexNumber.service.Calculate;

public class RunProgram {

	Scanner input = new Scanner(System.in);
	Calculate calculate = new Calculate();
	ComplexNumber complexNumber = new ComplexNumber();
	
	public void play() {
		int choose;
		while (true) {
			showMenu();
			System.out.print("Enter yours selection : ");
			choose = input.nextInt();
			Calculate calculate;
			
			switch (choose) {
			case 1:
				complexNumber = Calculate.inputNumb();
				complexNumber.showComNumb();
				break;
			case 2:
				complexNumber = Calculate.additionNumb(complexNumber, complexNumber);

				break;
			case 3:
//				calculate.multi();
				break;
			default:
				System.out.println("Your selection does not match. Please enter again!");
				System.out.println("Enter yours selection(from 1 to 4) : ");
				break;
			}
		}
	}

	public void showMenu() {
		System.out.println("**************************************************");
		System.out.println("**                                              **");
		System.out.println("**             	  SHOW MENU                     **");
		System.out.println("**        1.Enter the complex number            **");
		System.out.println("**        2.Sum to complex numbers              **");
		System.out.println("**        3.Subtract to complex numbers         **");
		System.out.println("**                                              **");
		System.out.println("**************************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunProgram main = new RunProgram();
		main.play();
	}

}
