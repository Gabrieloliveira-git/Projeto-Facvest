	import java.util.Scanner;
	import java.util.Locale;

	public class impostoRenda {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner scan = new Scanner(System.in);
			
			double servicos, capital, gastosMedicos, educacao, gastosTotais = 0;
			double salarioMensal, salarioAnual, impostoSalario = 0;
			double impostoServicos = 0, impostoCapital = 0, impostoBruto, maximoDedut;
			
			
			System.out.printf("Renda anual com salario: ");
			salarioAnual = scan.nextDouble();
			System.out.printf("Renda anual com servicos: ");
			servicos = scan.nextDouble();
			System.out.printf("Renda anual com capital: ");
			capital = scan.nextDouble();
			System.out.printf("Renda anual com gastosMedicos: ");
			gastosMedicos = scan.nextDouble();
			System.out.printf("Renda anual com educao: ");
			educacao = scan.nextDouble();
			
			System.out.println("\nRELATORIO DE IMPOSTO DE RENDA:\n ");
			
			System.out.println("CONSOLIDADO DE RENDA: ");
			
			salarioMensal = salarioAnual / 12;
			if (salarioMensal > 3000.0 && salarioMensal <= 5000.0) {
				impostoSalario = salarioAnual * 0.10; 	
		   }else if (salarioMensal > 5000.0) {	
				impostoSalario = salarioAnual * 0.20;
		   }
			
			System.out.printf("Imposto sobre o salario: %.2f\n ", impostoSalario);
			
			if (servicos > 0) {
				impostoServicos = servicos * 0.15;
			}
			System.out.printf("Imposto sobre o servicos: %.2f\n ", impostoServicos);
			
			if (capital > 0) {
				impostoCapital = capital * 0.20;
			}	
			System.out.printf("Imposto sobre o ganho de capital: %.2f\n ", impostoCapital);
			
			System.out.println("\nDEDUCOES: ");
			
			impostoBruto = impostoSalario + impostoServicos + impostoCapital;
			
			gastosTotais = gastosMedicos + educacao;
			
			maximoDedut = impostoBruto * 0.30;
			
			double abatimento = Math.min(gastosTotais, maximoDedut);
			
			System.out.printf("Maximo dedutivel: %.2f", maximoDedut);
			System.out.printf("\nGastos dedutivel: %.2f\n", gastosTotais);
			System.out.println("\nRESUMO:\n ");
			
			System.out.printf("imposto bruto total: %.2f", impostoBruto);
			System.out.printf("\nAbatimento: %.2f\n", abatimento);
			
			
			double impostoDevido = impostoBruto - abatimento;
			System.out.printf("impostoDevido: %.2f\n", impostoDevido );
			
			scan.close();
			
			
	    }
	}