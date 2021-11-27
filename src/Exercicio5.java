import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Digite uma palavra: ");

		Scanner sc = new Scanner(System.in);
		
		String invertida = "";
		String x = "null";

		x = sc.next();

		sc.close();
		
		for (int i = x.length()-1; i >= 0; i--){ 
			
			invertida += x.charAt(i); 
			
		} System.out.println("Palavra invertida: " + invertida);

	}

}
