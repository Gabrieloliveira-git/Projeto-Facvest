import java.util.Scanner;

public class codigoBar {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	char sexo;
	int cerveja, refri, espetinho;
	double consumo, ingresso;
	
	double valorRefri = 3;
	double valorCerveja = 5;
	double valorEspetinho = 7;
	double valorCouvert = 4;
	
	System.out.printf("Sexo F/M: ");
	sexo = scan.next().charAt(0);
	System.out.printf("Cervrja: ");
	cerveja = scan.nextInt();
	System.out.printf("Refri: ");
	refri = scan.nextInt();
	System.out.printf("Espetinho: ");
	espetinho = scan.nextInt();
	
	ingresso = (sexo == 'F' || sexo == 'f') ? 8.0 : 10.0;
		
	System.out.println(" RELATORIO: ");

	consumo = (cerveja * valorCerveja) + (refri * valorRefri) + (espetinho * valorEspetinho);
	System.out.printf("Consumo = R$ %.2f\n", consumo);
	
	if (consumo > 30) {
		valorCouvert = 0;
		
	System.out.printf("Couvert = R$ %.2f\n", valorCouvert);
	System.out.printf("Ingresso = R$ %.2f\n", ingresso);
	System.out.println();
	double valorTotal = consumo + valorCouvert + ingresso;
	System.out.printf("Valor a pagar =  R$ %.2f\n", valorTotal);
	
		}
	}
}