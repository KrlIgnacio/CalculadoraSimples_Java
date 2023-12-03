package codigo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double valor1;
		double valor2;
		String operacao;
		boolean continuar;

		try {

			do {
				System.out.println("Digite o valor um: ");
				valor1 = scan.nextDouble();

				System.out.println("Digite a operação: (+, /, -, *) ");
				operacao = scan.next();

				System.out.println("Digite o valor dois: ");
				valor2 = scan.nextDouble();

				System.out.println("Resultado: " + realizarCalculo(valor1, valor2, operacao));

				continuar = verificarNovaOperacao();

			} while (continuar);
		} catch (InputMismatchException ex) {
			System.out.println("Os valores digitados devem ser numéricos!");
		}
		scan.close();
	}

	public static boolean verificarNovaOperacao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja realizar uma nova operação? (S ou N) ");
		return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
	}

	public static Double realizarCalculo(double valor1, double valor2, String operacao) {
		Double respostaCalculo = 0.0;

		switch (operacao) {
		case "+":
			respostaCalculo = valor1 + valor2;
			break;
		case "-":
			respostaCalculo = valor1 - valor2;
			break;
		case "*":
			respostaCalculo = valor1 * valor2;
			break;
		case "/":
			respostaCalculo = valor1 / valor2;
			break;
		default:
			System.out.println("Operação inválida.");
		}

		return respostaCalculo;

	}
}
