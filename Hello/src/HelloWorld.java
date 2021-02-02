import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			int a;
			System.out.println("Primeiro programa no Eclipse");
			a = teclado.nextInt();
			System.out.println("Você digitou = "+a);
			
			teclado.close();
	} 
}
