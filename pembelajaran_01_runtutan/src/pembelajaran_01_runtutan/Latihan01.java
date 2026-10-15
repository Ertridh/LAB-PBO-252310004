package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("== Program Mengkonversi Suhu Celcius ==\n");
		
		System.out.print("Masukkan suhu celcius: ");
		double celcius = input.nextDouble();
		
		double fahrenheit = (9.0/5.0) * celcius + 32;
		double reamur = (4.0/5.0) * celcius;
		double kelvin = celcius + 273;
		
		System.out.println("Hasil konversi:");
		System.out.println("Fahrenheit: " + fahrenheit + " °F");
		System.out.println("Reamur: " + reamur + " °R");
		System.out.println("Kelvin: " + kelvin + " °K");
	}

}
