import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		A = sc.nextInt();
		
		// Se tiver só uma comando dentro do if / else, as chaves {} são opcionais
		if (A == 1) {
			System.out.println("Você digitou 1");
		} else if (A == 2) {
			System.out.println("Você digitou 2");
		} else {
			System.out.println("Você não digitou nem um, nem 2");
		}

		sc.close();

	}

}
