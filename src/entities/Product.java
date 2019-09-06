package entities;

public class Product {

	private String Name;
	private Double Price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.Name = name;
		this.Price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public Double getPrice() {
		return Price;
	}

	public void setPrice (Double price) {
		this.Price = Price;
	}

		
}
