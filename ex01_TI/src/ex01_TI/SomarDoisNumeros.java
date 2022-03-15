package ex01_TI;

import java.util.*;

public class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1, n2, soma;
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		
		System.out.println("A soma e:  " + soma);
	}
}
