package application;

public class Program {

	public static void main(String[] args) {

		// boxing
		int x = 20;
		// Estamos "transformando" o n que � um int (tipo valor) em um o objeto do tipo
		// Objeto (tipo refer�ncia), quando fazemos isso dizemos que estamos
		// encaixotando em um objeto
		Object obj = x;
		// Obs: todas as classes herdam da classe Object
		System.out.println("obj: " + obj);

		// unboxing
		int y = (int) obj; // Devemos fazer o cast pra converter do tipo Object pra int
		System.out.println("y: " + y);
		// Utilizando as wrapper classes n�o precisamos de cast no unboxing
		// Com as wrapper classes o unboxing � feito "naturalmente"
		// Para cada tipo primitivo, o Java tem uma wrapper class
		Integer intObj = x;
		System.out.println("intObj: " + intObj);
		int z = intObj;
		System.out.println("z: " + z);

		// wrapper classe costumam ser usadas nos campos de entidades de sistemas de
		// informa��o por poderem ser iniciadas como null (tipos primitivos n�o aceitam
		// o valor null) e por usufruirem dos recursos de orienta��o � objetos
		// Em bancos de dados � comum termos campos opcionais que, quando n�o
		// preenchidos, s�o iniciados como null

		// Wrapper classes
		// primitivo | wrapper class
		// byte | Byte
		// short | Short
		// int | Integer
		// long | Long
		// float | Float
		// double | Double
		// boolean | Boolean
		// char | Character

	}

}
