import java.util.Scanner;

public class Repeti��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumeros;
		int numero = 0;
		
		System.out.println("Informe o numero maximo de itera��es do la�o: ");
			Scanner leitor = new Scanner (System.in);	
						maxNumeros = leitor.nextInt();
						
						while (numero <= maxNumeros) {
							
							
							if(numero % 2 == 0){
							System.out.println(numero);	
							}
								
							numero++;
							
						
						}
						
	
	
	
	}

}
