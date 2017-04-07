import java.util.Scanner;

public class idad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);


		float soma, idade,  total, altura,x = 1;
		float contidade = 0, contaltura = 0, contidade1 = 0;
		double med= 0;
		while (x < 16) {
	
		System.out.println("Informe sua altura: ");
		altura= leitor.nextFloat();
		
		System.out.println("informe sua idade: ");
		idade= leitor.nextFloat();
		if (idade> 50){
	    contidade++;
	
	    }
	
		if(idade>=10 && idade<=20){
			contidade1++;
			med= (med+altura)/contidade1;
		}
	
		
		x = x + 1;  
		}
	System.out.println("A quantidade de pessoas acima de 50 anos é igual a:" + contidade);
	System.out.println("A média das alturas das pessoas entre idades 10 e 20 anos é igual é: " + String.format("%.3f" + med));
	 String.format("%.3f" + med);
	}
}
