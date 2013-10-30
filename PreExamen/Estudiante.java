package ejercicios;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Estudiante<T> implements Comparable<Estudiante>  {

	
	private String apellido;
	private int cod;
	private Float promedio;
	
	public Estudiante(String apellido, int cod, float promedio){
		
		this.apellido = apellido;
		this.cod = cod;
		this.promedio = promedio;
		
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public float getPromedio(){
	
		return this.promedio;
	}
	
	public void setPromedio(float promedio){
		
		this.promedio = promedio;
	}

	@Override
	public int compareTo(Estudiante o) {
		
		return this.promedio.compareTo(o.promedio);
	}	

	private Estudiante busqueda(ArrayLinearList<Estudiante> array, int n, float nota) {
		
		if(n < 0 || nota > 5.0f ){
			throw new IndexOutOfBoundsException("error in note or student");
		}
		
		Arrays.sort(array.element, 0, array.size);
		
		int inicio = 0;
		int fin = array.size()-1;
		int pos;
		 
		while(inicio <= fin){
			pos = (inicio + fin)/ 2;
			Estudiante m = array.get(pos);
			if(m.promedio == nota){
				Estudiante k = array.get(pos + (n-1));
				return k;
			}else{
				if(m.promedio < nota){
					inicio = pos + 1;
				}else{
					fin = pos-1;
				}
			}
		}
		return null;
	}
	
	public void sortName(ArrayLinearList array){
		
		  Comparator c = new  Comparator<Estudiante>(){ 
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getApellido().compareTo( o2.getApellido());
			}
		  };
		  
		  Arrays.sort(array.element, 0, array.size, c);
	}

	@Override
	public String toString(){
		return String.format("%2s | %4d | %.2f " , apellido,cod,promedio);
	}
	
	public static void main(String[]  args){
		
		Scanner s = new Scanner(System.in);
		ArrayLinearList<Estudiante> list = new ArrayLinearList<>();
		Estudiante x = new Estudiante("Gómez",2860, 4.5f), 
				y = new Estudiante("Lennon",5482, 2.5f), 
				z = new Estudiante("Clarke", 3476, 4.0f), 
				a = new Estudiante("Tolkien", 1058, 4.6f),
		        b = new Estudiante<>("Fwalt",3456,5.0f),
		        c = new Estudiante<>("Jopnis", 3584, 3.8f);
		
		list.add(0,a);
		list.add(1,b);
		list.add(2,x);
		list.add(3,y);
		list.add(4,z);
		list.add(5,c);
		
	    x.sortName(list);
	
		for(Estudiante h : list){
			System.out.println(h);
		}
		//System.out.println(list);
		System.out.println("ingrese la nota desde la que quiere buscar: ");
		float f = s.nextFloat();
		System.out.println("Ingre el número de estudinate que busca a partir de esa nota: ");
		int v = s.nextInt();
		
		Estudiante e = x.busqueda(list,v,f);
		
		System.out.println("el estudiante en la posicion "+ v +" es : ");
		System.out.println(e);
		
	}
	}


