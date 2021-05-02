package meu_salario;
import java.util.Locale;
import java.util.Scanner;

	// Pesquisar -> https://www.guj.com.br/t/calcular-horas-dentro-de-um-list/83565/5

public class Salary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("VALOR DO SALARIO: ");
		double salario = scan.nextDouble();

		System.out.println("HORA DA ENTRADA:");
		int horaInicial = scan.nextInt();

		System.out.println("HORA DA SAIDA: ");
		int horaFinal = scan.nextInt();

		System.out.println("MINUTOS: ");
		int minuto = scan.nextInt();

		System.out.println("QUANTOS DIAS TRABALHOU? ");
		int dia = scan.nextInt();

		System.out.println("TRABALHOU NA FOLGA? 'Sim/Nao?'");
		char folgaTrabalhada = scan.next().charAt(0);

		

		double valorDia = salario / 30;
		double valorHora = salario / 220;
		double valorMinuto = valorHora / 60;

		double valorHoraExtra = valorHora * 1.60;
		double valorHorasCemPorcento = valorHora * 2.0;

		double diasTrabalhado = valorDia * dia;

		int horasExtra, horasTrab, totalHoras, menosHorasTrabalhada = 0, horasCemPorcento, totalHorasExtra;
		double horasTotal = 0, totalCemPorcento = 0, valorTotal, menosHorasPagar;

		totalHoras = horaFinal - horaInicial;

		horasExtra = totalHoras - 8;
		totalHorasExtra = horasExtra * dia;
		horasTotal = totalHorasExtra * valorHoraExtra;
		menosHorasPagar = valorHora * menosHorasTrabalhada;

		System.out.printf("VALOR DA HORA = R$ %.2f%n", valorHora);
		System.out.printf("VALOR DO DIA = R$ %.2f%n", valorDia);
		System.out.printf("VALOR TOTAL DOS DIAS TRABALHADOS: R$ %.2f%n", diasTrabalhado);
		System.out.println(scan.nextLine());

		switch (folgaTrabalhada) {
		case 'S':
		case 's':
			System.out.println("QUANTAS HORAS TRABALHOU NA SUA FOLGA? ");
			horasCemPorcento = scan.nextInt();

			totalCemPorcento = horasCemPorcento * valorHorasCemPorcento;

			System.out.println("TOTAL A RECEBER 100% R$: " + totalCemPorcento);
			System.out.println(scan.nextLine());
			break;
		case 'N':
		case 'n':
			break;
		}
		
		System.out.println("TRABALHOU MENOS HORAS ALGUM DIA? 'Sim/Nao?'");
		char menosHoras = scan.next().charAt(0);
		switch (menosHoras) {
		case 'S':
		case 's':
			System.out.println("QUANTAS HORAS TRABALHOU NESSE DIA? ");
			menosHorasTrabalhada = scan.nextInt();
			
			menosHorasPagar = valorHora * menosHorasTrabalhada;

			System.out.printf("RECEBER DAS HORAS TRABALHADA NAO INTEGRAL R$: %.2f%n", menosHorasPagar);
			System.out.printf(scan.nextLine());
			break;
		case 'N':
		case 'n':
			break;
		}

		System.out.println("DADOS REFERENTE A " + dia + " DIA(S)");
		System.out.println(scan.nextLine());

		if (horaInicial > horaFinal) {
			totalHoras = horaInicial - horaFinal;

			System.out.println("TOTAL DE HORAS = " + totalHoras + " Horas");

		} else if (totalHoras > 8) {

			System.out.println("TOTAL DE HORAS EXTRAS: " + totalHorasExtra + " horas");

		} else {
			horasTrab = 8 - totalHoras;
			System.out.println("TOTAL DE HORAS: " + horasTrab);
		}
		
		System.out.printf("TOTAL A RECEBER DE HORAS EXTRAS: R$ %.2f%n", horasTotal);

		if (minuto != 0) {
			System.out.printf("VALOR DO MINUTO = R$ %.2f%n", valorMinuto);
		} else {

		}

		valorTotal = dia * valorDia + (horasTotal + totalCemPorcento + menosHorasPagar);
		System.out.printf("VALOR DA HORA EXTRA R$: %.2f%n", valorHoraExtra);
		System.out.printf(scan.nextLine());

		System.out.printf("TOTAL A RECEBER: R$ %.2f%n", valorTotal);
		scan.close();
	}

}
