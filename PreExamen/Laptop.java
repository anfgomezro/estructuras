package ejercicios;

import java.util.Comparator;

public class Laptop extends Computer {

	public Laptop(long id, double price, int ram, int storageCapacity, float batteryLife) {
		super(id,price,ram, storageCapacity);
		 this.batteryLife = batteryLife;
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	float batteryLife;

	public float getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(float batteryLife) {
		this.batteryLife = batteryLife;
	}
	 
	 public static void main(String[] args){
		   
		 ArrayLinearList<? super Product> sor = new ArrayLinearList<>();
		 Computer t = new  Laptop();
		 Product y = new Product();
		 Laptop e = new Laptop();
		 Computer w = new Computer();
		 Product a = new Product();
		 
		 sor.add(0, t);
		 sor.add(1, y);
		 sor.add(2, e);
		 sor.add(3, w);
		 sor.add(4, a);
		 
		 for(Object l : sor){
			 System.out.println(l.getClass());
		 }
		 
	 }

}
