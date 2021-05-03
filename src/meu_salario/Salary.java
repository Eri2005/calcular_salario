package meu_salario;
import java.util.Locale;
import java.util.Scanner;
import calculo.Hora;

public class Salary {

	public static void main(String[] args) {
		
		/*
		SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");
		Calendar entrance = Calendar.getInstance();
		Calendar initialRest = Calendar.getInstance();
		Calendar finalRest = Calendar.getInstance();
		Calendar finalWork = Calendar.getInstance();
		*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("VALOR DO SALARIO: ");
		double salary = scan.nextDouble();

		System.out.println("HORA DA ENTRADA:");
		int entrance = scan.nextInt();
		//entrance.setTime(FORMAT.parse(scan.next()));
		
		System.out.println("MINUTOS: ");
		int initialMinute = scan.nextInt();
		
		System.out.println("HORA DA ENTRADA DO ALMOÇO:");
		int entranceLunch = scan.nextInt();
		
		System.out.println("MINUTOS: ");
		int minuteLunch = scan.nextInt();
		
		System.out.println("HORA DO RETORNO DO ALMOÇO: ");
		int returnLunch = scan.nextInt();
		
		System.out.println("MINUTOS: ");
		int finalLunch = scan.nextInt();

		System.out.println("HORA DA SAIDA: ");
		int finalWork = scan.nextInt();
		//finalWork.setTime(FORMAT.parse(scan.next()));

		System.out.println("MINUTOS: ");
		int finalMinute = scan.nextInt();

		System.out.println("QUANTOS DIAS TRABALHOU? ");
		int day = scan.nextInt();

		System.out.println("TRABALHOU NA FOLGA? 'Sim/Nao?'");
		char folgaTrabalhada = scan.next().charAt(0);

		Hora value = new Hora(salary);

		//double valueDay = salary / 30;
		//double valueHour = salary / 220;
		//double valueMinute = valueHour / 60;

		double valorHoraExtra = valueHour * 1.60;
		double valorHorasCemPorcento = valueHour * 2.0;

		double diasTrabalhado = valueDay * day;

		int hoursExtra, horasTrab, totalHoras, menosHorasTrabalhada = 0, horasCemPorcento, totalHorasExtra;
		double horasTotal = 0, totalCemPorcento = 0, valorTotal, menosHorasPagar;

		totalHoras = finalWork - entrance;

		hoursExtra = totalHoras - 8;
		totalHorasExtra = hoursExtra * day;
		horasTotal = totalHorasExtra * valorHoraExtra;
		menosHorasPagar = valueHour * menosHorasTrabalhada;

		System.out.printf("VALOR DA HORA = R$ %.2f%n", valueHour);
		System.out.printf("VALOR DO DIA = R$ %.2f%n", valueDay);
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
			
			menosHorasPagar = valueHour * menosHorasTrabalhada;

			System.out.printf("RECEBER DAS HORAS TRABALHADA NAO INTEGRAL R$: %.2f%n", menosHorasPagar);
			System.out.printf(scan.nextLine());
			break;
		case 'N':
		case 'n':
			break;
		}

		System.out.println("DADOS REFERENTE A " + day + " DIA(S)");
		System.out.println(scan.nextLine());

		if (entrance > finalWork) {
			totalHoras = entrance - finalWork;

			System.out.println("TOTAL DE HORAS = " + totalHoras + " Horas");

		} else if (totalHoras > 8) {

			System.out.println("TOTAL DE HORAS EXTRAS: " + totalHorasExtra + " horas");

		} else {
			horasTrab = 8 - totalHoras;
			System.out.println("TOTAL DE HORAS: " + horasTrab);
		}
		
		System.out.printf("TOTAL A RECEBER DE HORAS EXTRAS: R$ %.2f%n", horasTotal);

		if (valueMinute != 0) {
			System.out.printf("VALOR DO MINUTO = R$ %.2f%n", valueMinute);
		} else {

		}

		valorTotal = day * valueDay + (horasTotal + totalCemPorcento + menosHorasPagar);
		System.out.printf("VALOR DA HORA EXTRA R$: %.2f%n", valorHoraExtra);
		System.out.printf(scan.nextLine());

		System.out.printf("TOTAL A RECEBER: R$ %.2f%n", valorTotal);
		scan.close();
	}

}
