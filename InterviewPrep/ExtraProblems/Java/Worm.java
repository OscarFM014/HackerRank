import java.util.*;
public class Worm{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int stack = sc.nextInt();
		int[] space = new int[stack];
		for (int i = 0; i < stack; i++) {
			space[i] = sc.nextInt();	
		}
		
		int buenos = sc.nextInt();
		int[] etiquetas = new int[buenos];
		for (int i = 0; i < buenos; i++) {
			etiquetas[i] = sc.nextInt();
		}
		
		int[] arreglo = new int[stack];
		int acum = 0;
		for (int i = 0; i < space.length; i++) {
			acum += space[i];
			arreglo[i] = acum;
		}		
		
		for (int i = 0; i < etiquetas.length; i++) {
			int index = Arrays.binarySearch(arreglo, etiquetas[i]);
			
			if( index >= 0 && arreglo[index] == etiquetas[i] ) {
				System.out.println(index + 1);
			}else {
				while(index > 1 && arreglo[index] == arreglo[index-1]) {
					index = index -1;
				}
				System.out.println(Math.abs(index));
			}

		}
	}
}