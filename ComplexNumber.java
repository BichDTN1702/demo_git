package com.tsdv.ComplexNumber.entity;

public class ComplexNumber {
	// for real and imaginary parts of complex numbers
	private double real;
	private double imaginary ;
	
	public ComplexNumber() {

	}

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary  = imaginary ;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary ;
	}

	public void setImaginary (double imaginary ) {
		this.imaginary  = imaginary ;
	}
	
	public void showComNumb(){
		System.out.println("Complex number just entered is : " + real + " + " + imaginary + "i");
	}
	
}
