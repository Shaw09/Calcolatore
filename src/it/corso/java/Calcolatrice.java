package it.corso.java;

public class Calcolatrice {
	public double somma (double a, double b) {
		return a+b;
	}
	public double sottrazione (double a, double b) {
		return a-b;
	}
	public double moltiplicazione (double a, double b) {
		return a*b;
	}
	public double divisione (double a, double b) {
		if (b == 0) {
			System.out.println("ATTENZIONE: divisione per 0!!!");
		}
		return a/b;
	}
	
	public int somma (int a, int b) {
		return a+b;
	}
	public int sottrazione (int a, int b) {
		return a-b;
	}
	public int moltiplicazione (int a, int b) {
		return a*b;
	}
	public int divisione (int a, int b) {
		if (b == 0) {
			System.out.println("ATTENZIONE: divisione per 0!!!");
		}
		return a/b;
	}
}
