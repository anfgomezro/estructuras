package ejercicios;

public class Product {

	long id;
	double price;
	
	public Product(long id, double price){
		this.id= id;
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
