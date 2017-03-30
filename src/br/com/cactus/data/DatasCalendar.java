package br.com.cactus.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatasCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		System.out.println("DATA ATUAL: " + c.getTime());

		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.HOUR_OF_DAY, 16);
		c.set(Calendar.MINUTE, 19);
		c.set(Calendar.SECOND, 0);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("DATA FORMATADA E HORA: " + df.format(c.getTime()));

		//SOMANDO 1 DIA DO MÊS
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("SOMANDO 1 DIA: " + df.format(c.getTime()));

		//SOMANDO 1 MÊS.
		c.add(Calendar.MONTH, 1);
		System.out.println("SOMANDO 1 MÊS: " + df.format(c.getTime()));

		c.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println("subtraindo 5 dias: " + df.format(c.getTime()));

		c.roll(Calendar.DAY_OF_MONTH, 25);
		System.out.println("SOMANDO 1 DIA: " + df.format(c.getTime()));

	}
}
