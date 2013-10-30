package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Adivinar {
	
	public static void main(String[] args){
		ArrayLinearList<Integer> list = new ArrayLinearList<>();
		for(int i = 0; i < 8; i++){
			list.add(i, (int) (Math.random()*999));
		}
		
		Arrays.sort(list.element,0,list.size);
		System.out.println(list);
		System.out.println("ELIJA UN NÚMERO DE LA LISTA");
		
		juego(list);
	}

	@SuppressWarnings("rawtypes")
	private static void juego(ArrayLinearList list) {
		Scanner s = new Scanner(System.in);
		int inicio = 0;
		int fin = list.size-1;
		int pos;
		while(inicio <= fin){
			pos= (inicio + fin)/2;
		System.out.println("su número es mayor, menor o igual: "+ list.get(pos));
		String g = s.nextLine();
		switch(g){
		case "igual":
			System.out.println("Game Over");
			fin= -1;
			break;
		case"menor":
			fin = pos -1;
			break;
		case"mayor":
			inicio = pos+1;
			break;
			
		}
		}
	}

}
