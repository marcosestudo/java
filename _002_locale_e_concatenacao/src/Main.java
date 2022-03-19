import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Para setar o ponto como separador de decimais, o printf por padrão printa no formato do computador 
		Locale.setDefault(Locale.US);
		
		double x = 12.52525;
		
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f\n", x);
		
		// Concatenação
		// println
		System.out.println("palavra1 " + x + " palavra2" );
		// printf
		System.out.printf("palavra1 %.2f palavra2%n", x);
		
		String nome = "Maria";
		int idade = 52;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);
			
	}

}
