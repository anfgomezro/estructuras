package ejercicios;

import java.util.Arrays;
import java.util.Comparator;

public class Computer extends Product {

	int ram;
	int storageCapacity;
	
	public Computer(int ram){
		this(00,324,ram,500);
	}
	
	public Computer(long id, double price, int ram, int storageCapacity){
		super(id,price);
		this.ram = ram;
		this.storageCapacity = storageCapacity;
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sortRam(ArrayLinearList m){
		Comparator c = new  Comparator<Computer>(){ 
			@Override
			public int compare(Computer o1, Computer o2) {
				return o1.getRam() - o2.getRam();
			}
		  };
		  
		  Arrays.sort(m.element, 0,m.size,c);
	}
	
	
	@Override
	public String toString(){
		return String.format(" %d"  , ram);
	}
	
	public static void main(String[] args){
		
		ArrayLinearList<? super Product> sor = new ArrayLinearList<>();
		Computer m = new Computer(45);
		Computer r = new Computer(34);
		Computer t = new Computer(53);
		Computer e = new Computer(89);
		Computer md = new Computer(12);
		Computer b= new Computer(23);
		
		sor.add(0,m);
		sor.add(1,r);
		sor.add(2,t);
		sor.add(3,e);
		sor.add(4,md);
		sor.add(5,b);
		
		sortRam(sor);
		
		for(Object h : sor){
			System.out.println(h);
		}
		
		
	}
	
}
