import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		// input de uma palavra		
//		String x = sc.next();	
//		// digitando sysout e tclando ctrl + espaço, o eclipse completa com println
//		System.out.println("Você digitou: " + x);
//		
//		
//		int x2 = sc. nextInt();
//		System.out.println("Você digitou: " + x2);
//		
//		
//		// pega a localidade do sistema, devemos mudar com o locale para considerarmos o ponto como 
//		// separador de decimais
//		double x3 = sc. nextDouble();
//		System.out.println("Você digitou: " + x3);
//		
//
//		// input de um caracter		
//		char x4 = sc.next().charAt(0);	
//		System.out.println("Você digitou: " + x4);
						
		
//		// input de um caracter		
//		String x5 = sc.nextLine();	
//		System.out.println("Você digitou: " + x5);
		
		
		// quebra de linha pendente		
		// quando damos enter pro nextInt(), a quebra de linha do enter fica pendente na entrada padrão 
		// o próximo nextLine() consome essa quebra de linha
		// a solução é colocar um nextline() depois de um nextInt() ou next() 
		int x2 = sc. nextInt();
		sc.nextLine();
		String x5 = sc.nextLine();
		System.out.println("Você digitou: " + x2);
		System.out.println("Você digitou: " + x5);
		
		
		sc.close();
		
	}

}
