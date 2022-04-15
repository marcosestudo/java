package util;

public class Calculator {

	// Declaração da constante PI > public static final double PI = 3.14
	// Por padrão, no Java, constantes são escritas com letras maiúsculas
	// O final é usado pra dizer que não será mudado

	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
