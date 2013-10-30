package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PreExamen {
	
	public static void printIndexes(ArrayList<Integer> l, ArrayList<Integer> p){
		for(int i = 0; i < p.size(); i++){
			System.out.println(l.get(p.get(i)));
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList interseccion(ArrayList q, ArrayList w){
		ArrayList m = new ArrayList<>();
		
		for(int  i = 0; i< w.size(); i++){
			if(q.contains(w.get(i))){
				m.add(w.get(i));
			}
		}
		
		return m;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList union(ArrayList n, ArrayList m){
		ArrayList p = new ArrayList<>();
           for(int i = 0 ; i < n.size(); i++){
        	  p.add(n.get(i));
           }
           for(int j = 0; j < m.size(); j++ ){
        	   if(!n.contains(m.get(j))){
        		   p.add(m.get(j));
        	   }
           }
           
		return p;
	}
	
	public static void dfs(int[][] m ,int n){
		System.out.println(n);
		
		for(int i = 0; i < m.length ; i++){
			if(m[n][i]==1 && w[n][i] == false){
				w[n][i] = true;
				w[i][n] = true;
				dfs(m,i);
			}
		}
		
	}
	
	
	
	static boolean[][] w =  new boolean[7][7];
	
	public static boolean isBalanced(String g){
		Stack<Integer> e = new Stack<>();
		for(int i = 0; i < g.length(); i++){
			if(!e.isEmpty()){
				if(g.charAt(i) == ')' ||g.charAt(i) == ']'|| g.charAt(i) == '}'){
					if(g.charAt(i)== '*' && g.charAt(i-1)!='*'){
						e.pop();
					}
					if(g.charAt(i)== '/' && g.charAt(i-1)!='/'){
						e.pop();
					}
					e.pop();
				}else{
					e.push(i);
				}
			}else{
				e.push(i);
			}
		}
		if(e.isEmpty()){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> l = new ArrayList<>();
		ArrayList<Integer> p = new ArrayList<>();
		p.add(new Integer(1));
		p.add(new Integer(3));
		p.add(new Integer(4));
		p.add(new Integer(5));
		p.add(new Integer(6));
		
		for(int i = 0 ; i <10; i++)
			l.add(i,new Integer(i+2));
		
         int[][] m = {{0,1,1,1,0,0,0},{1,0,0,0,1,0,0},{1,0,0,0,0,1,1},{1,0,0,0,0,0,0},{0,1,0,0,0,0,0},{0,0,1,0,0,0,0},{0,0,1,0,0,0,0}};

         String g = s.nextLine();
         
         System.out.println(isBalanced(g));
		
	}

}
