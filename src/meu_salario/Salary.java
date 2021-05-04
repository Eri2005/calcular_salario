package meu_salario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//import calculo.Hora;

public class Salary {

	public static void main(String[] args) {
		
		
		SimpleDateFormat spf = new SimpleDateFormat("HH:mm");
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("VALOR DO SALARIO: ");
		double salary = scan.nextDouble();

		System.out.println("HORA DA ENTRADA:");
		String entrance = scan.next();
		//Date entrance1 = spf.parse(entrance);
		
		//System.out.println("HORA DA ENTRADA DO ALMOÇO:");
		//String entranceLunch = scan.next();
		//Date entranceLunch1 = spf.parse(entranceLunch);
		
		//System.out.println("HORA DO RETORNO DO ALMOÇO: ");
		//String returnLunch = scan.next();
		//Date returnLunch1 = spf.parse(entranceLunch);

		System.out.println("HORA DA SAIDA: ");
		String finalWork = scan.next();
		//Date finalWork1 = spf.parse(finalWork);

		System.out.println("QUANTOS DIAS TRABALHOU? ");
		int day = scan.nextInt();

		//System.out.println("TRABALHOU NA FOLGA? 'Sim/Nao?'");
		//char folgaTrabalhada = scan.next().charAt(0);
		
		Date entrance1 = null;
		Date finalWork1 = null;
		//Date entranceLunch1 = null;
		//Date returnLunch1 = null;
		
		try {
			entrance1 = spf.parse(entrance);
			finalWork1 = spf.parse(finalWork);
			//entranceLunch1 = spf.parse(entranceLunch);
			//returnLunch1 = spf.parse(returnLunch);
		}catch (ParseException e){
			e.printStackTrace();
		}
		
		long diffWork = finalWork1.getTime() - entrance1.getTime();
		Long diffHours = diffWork / (60 * 60 * 1000);
		Long diffMinutes = diffWork / (60 * 1000) % 60;
		
		//long diffLunch = returnLunch1.getTime() - entranceLunch1.getTime();
		//Long differHours = diffLunch / (60 * 60 * 1000);
		//Long differMinutes = diffLunch / (60 * 1000) % 60;
		
		//Long totalHours = ((finalWork1.getTime() - entrance1.getTime()) / 3600) / 1000;
		
		//List<Hora> list = new ArrayList<>();
		
		double valueHours = salary / 220;
		double valueMinutes = valueHours / 60;
		
		double valorHoraExtra = valueHours * 1.50;
		double valorHorasCemPorcento = valueHours * 2.0; 
		double valueDay = salary / 30;
		double dayWorked = valueDay * day;

		double hoursExtra = diffHours - 8;
		
		Integer totalHorasExtra = (int)hoursExtra * day; 
		double hoursTotal = totalHorasExtra * valorHoraExtra; 
		double horasTrab = diffHours - 8;
		double totalCemPorcento = horasTrab * valorHorasCemPorcento;
		
		System.out.println("TOTAL DE HORAS TRABALHADA: " + diffHours + "H:" + diffMinutes+ "m");
		System.out.printf("VALOR DA HORA = R$ %.2f%n", valueHours);
		System.out.printf("VALOR DO DIA = R$ %.2f%n", valueDay);
		System.out.printf("VALOR TOTAL DOS DIAS TRABALHADOS: R$ %.2f%n", dayWorked);
		System.out.println(scan.nextLine());


		System.out.println("DADOS REFERENTE A " + day + " DIA(S)");
		System.out.println(scan.nextLine());

		if (diffHours > 8) {

			System.out.println("TOTAL DE HORAS EXTRAS: " + totalHorasExtra + " horas");

		}
		
		System.out.printf("TOTAL A RECEBER DE HORAS EXTRAS: R$ %.2f%n", hoursTotal);

		if (valueMinutes > 0) {
			System.out.printf("VALOR DO MINUTO = R$ %.2f%n", valueMinutes);
		} 

		double valorTotal = day * valueDay + (hoursTotal + totalCemPorcento);
		
		System.out.printf("VALOR DA HORA EXTRA R$: %.2f%n", valorHoraExtra);
		System.out.printf(scan.nextLine());

		System.out.printf("TOTAL A RECEBER: R$ %.2f%n", valorTotal);
		scan.close();
	}
}
