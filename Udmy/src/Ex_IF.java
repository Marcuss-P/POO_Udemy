import java.util.Locale;
import java.util.Scanner;

public class Ex_IF {

	public static void main(String[] args) {

		double valor, saida;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de entrada: ");

		valor = sc.nextDouble();

		if (valor <= 2000.0) {

			System.out.println("Isento");

		} else if (valor <= 3000.0) {

			saida = (valor - 2000.0) * 0.08;

			System.out.printf("R$ %.2f%n", saida);

		} else if (valor <= 4500.0) {

			saida = (valor - 3000) * 0.18 + 1000.0 * 0.08;

			System.out.printf("R$ %.2f%n", saida);

		} else {

			saida = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

			System.out.printf("R$ %.2f%n", saida);

		}

		sc.close();
	}

}
