package ejercicios;

import java.util.Scanner;

public class Piramide {

	static Scanner sn=new Scanner (System.in);
	
	public static void main(String[] args){
		Piramide p = new Piramide();
		p.calculo();
	}

	private void calculo() {
		System.out.println("ingrese el tamaño n de la piramide");
		int n = sn.nextInt();
		for(int i = 0; i < n; i++)
	    {
	        for(int j = n-1; j >= 0; j--)
	        {
	    
	        	if (i < j){
	        		System.out.println(" ");
	        	}else{
	        		System.out.println("x");
	        	}
	        }
	        
	        for(int j = 1; j < n; j++)
	        {
	            if (j > i){
	                System.out.println(" ");
	            }else{
	                System.out.println("x");
	        }
	        }
	        
	        }
		
		
	}
	
}
