import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		
		System.out.println("Insira um número");
		int num = sc.nextInt();;

		while (num != 0) {
			System.out.println("Insira um número");
			soma += num;
			num = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
