public class Main {

	public static void main(String[] args) {
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		resultado = a / b;

		// divisão de 2 inteiros retorna o resultado inteiro como o operador "//" do python
		System.out.println(resultado);

		// para retornar o valor preciso, devemos dividir com um dos numeros double ou fazer um casting
		resultado = (double) a / b;
		System.out.println(resultado);
		
	}

}
