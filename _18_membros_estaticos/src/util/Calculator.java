package util;

public class Calculator {

	// Declara��o da constante PI > public static final double PI = 3.14
	// Por padr�o, no Java, constantes s�o escritas com letras mai�sculas
	// O final � usado pra dizer que n�o ser� mudado

	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
