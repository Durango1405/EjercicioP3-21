package Actividad2;

import java.util.Scanner;
import java.lang.Math;
public class Triangulo {
	public static void main(String[] args) {
		double lado1;
		double lado2;
		double lado3;
		double perimetro;
		double semiperimetro;
		double area;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese lado 1 del triangulo equilatero:");
		lado1 = entrada.nextDouble();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese lado 2 del triangulo equilatero:");
		lado2 = entrada1.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese lado 3 del triangulo equilatero:");
		lado3 = entrada2.nextDouble();
		
		perimetro=lado1+lado2+lado3;
		semiperimetro=perimetro/2;
		area=Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
		
		System.out.println("perimetro triangulo: " + perimetro);
		System.out.println("semiperimetro triangulo: " + semiperimetro);
		System.out.println("area triangulo: " + area+" cm2");
		
		entrada.close();
		entrada1.close();
		entrada2.close();
	}
}
