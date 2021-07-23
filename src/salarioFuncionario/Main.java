package salarioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int numFuncionario;
		double numHorasTrab, valorHora, salario;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do funcionário, o valor das horas trabalhadas e o valor da hora.");
		numFuncionario = sc.nextInt();
		numHorasTrab = sc.nextDouble();
		valorHora = sc.nextDouble();

		salario = numHorasTrab * valorHora;

		System.out.printf("NUMBER = %d%n", numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}

}
