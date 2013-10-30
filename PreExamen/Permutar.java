package ejercicios;

import java.util.Arrays;

public class Permutar{

		private static Comparable[] nextPermutation( Comparable[] c ) {
			
			int first = getIndex( c );
			
			if ( first == -1 ) {
				return null; 
			}

			int toSwap = c.length - 1;
			
			while ( c[ first ].compareTo( c[ toSwap ] ) >= 0 ){
				--toSwap;
			}
			
			cambio( c, first++, toSwap );

			toSwap = c.length - 1;
			
			while ( first < toSwap ){
				cambio( c, first++, toSwap-- );
			}
			
			return c;
		}
		
	
	    private static void cambio( Comparable[] c,  int i, int j ) {
			final Comparable tmp = c[ i ];
			c[ i ] = c[ j ];
			c[ j ] = tmp;
		}
		
		private static int getIndex( Comparable[] c ) {
				for ( int i = c.length - 2; i >= 0; --i ){
					if ( c[ i ].compareTo( c[ i + 1 ] ) < 0 ){
						return i;
						}
					}
					return -1;
				}
		
		public static int factorial(int n){
			int factorial = 1;
			while(n!= 0){
			factorial = factorial*n;
			n--;
			}
			return factorial;
		}
		
     private static void allPermutations( Comparable[] c ) {
			
			System.out.println( Arrays.toString( c ) );
			
			while ( ( c = nextPermutation( c ) ) != null ) {
				
				System.out.println( Arrays.toString( c ) );
			}
		}
		
		public static void main(String[] args){
			
			Comparable[] as = new Comparable[4];
			
			for(int i =0; i<as.length; i++){
				as[i]= (int) (Math.random()*100);
			}
			
			System.out.println(Arrays.toString(as));
		    System.out.println();
			System.out.println(Arrays.toString(nextPermutation(as)));

		}
}
