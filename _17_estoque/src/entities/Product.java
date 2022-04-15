package entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Toda classe java herda da classe Object
	// Aqui estamos sobrescrevendo a fun��o toString(), uma das fun��es da classe
	// Object

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " unidades, total: $" + String.format("%.2f", totalValueInStock());
	}
}
