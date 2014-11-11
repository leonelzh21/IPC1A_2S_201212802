import java.util.Scanner;
public class Main {

	public static void main(String[]args){
		
	int numero = 0,cont1=2;
	boolean cont2 = true;		
		System.out.println("Ingrese Numero");
		Scanner s=new Scanner(System.in);		
	
		numero = s.nextInt();
		while(cont1<numero){
		if (numero % cont1 ==0)
				cont2= false;
		cont1++;
		}
			if(cont2)
				System.out.println("el numero es primo");
			else 
				System.out.println("no es primo");
		}
		
		
		
	}

