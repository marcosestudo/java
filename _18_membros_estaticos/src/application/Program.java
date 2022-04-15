package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		// membros est�ticos podem ser chamados de membros de classe
		// N�o precisam de instanciados para serem usador
		// Como exemplo de membro est�tico temos a fun��o Math.sqrt()
		// O m�todo Scanner(), por exemplo, por n�o ser est�tico, precisamos instanciar
		// o objeto sc com o new Scanner(), como na linha 19 deste arquivo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}
