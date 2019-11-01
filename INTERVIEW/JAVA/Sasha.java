import java.util.Scanner;

public class Km_price {
	
	public static int price(int km, int ltr) {
		int lack = km-1;
		int price = 0;
		
		if(lack < ltr) {
			return lack;
		}
		for(int i=1; i<km; i++) {
			if(lack >0) {
				if(lack == km-1) {
					price += (1*ltr);
					lack -= ltr;
				}
				else {
					price += (i*1);
					lack --;	
				}
			}else {
				break;
			}
		}
		return price;
	}
	 public static void main(String args[]){
	        
		    Scanner res = new Scanner(System.in);

	        int a = res.nextInt();
	        int b = res.nextInt();

	        
	        System.out.println(price(a,b));
	        res.close();


	    }
}