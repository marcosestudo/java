import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();
		
		// Se tiver s� uma comando dentro do if / else, as chaves {} s�o opcionais
		if (A == 1) {
			System.out.println("Voc� digitou 1");
		} else if (A == 2) {
			System.out.println("Voc� digitou 2");
		} else {
			System.out.println("Voc� n�o digitou nem um, nem 2");
		}

		sc.close();

	}

}
