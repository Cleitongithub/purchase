package entities;

public class OrderItem {

	private Integer Quantity;
	private Double Price;
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
	    this.Quantity = quantity;
		this.Price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		this.Quantity = quantity;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		this.Price = price;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return Price * Quantity;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $" 
				+ String.format("%.2f", Price) 
				+ ", Quantity: " 
				+ Quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}
