package br.com.java.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = scan.nextDouble();
		
		double soma = soma(a, b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
	}
	public static double soma(double a,double b) {
		return a + b;
	}
	public static double subtracao(double a,double b) {
		return a - b;
	}
	public static double multiplicacao(double a,double b) {
		return a * b;
	}
	public static double divisao(double a,double b) {
		return a / b;
	}
}
