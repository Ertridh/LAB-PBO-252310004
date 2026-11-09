package pembelajaran_4_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Latihan03 {

	public static void main(String[] args) {
        ArrayList<ArrayList<String>> dataDosen = new ArrayList<>();
        
		dataDosen.add(new ArrayList<String>(Arrays.asList(
				"Nama Lengkap\t\t", "Alamat\t\t\t\t\t", "No Telp")));
		dataDosen.add(new ArrayList<String>(Arrays.asList(
				"Septian Cahyadi\t\t", "Dramaga cantik residance II, Bogor\t", "+62 899-9506-210")));
		dataDosen.add(new ArrayList<String>(Arrays.asList(
				"Isnan Mulia\t\t", "Jl.Manunggal, Bogor\t\t\t", "+62 819-3208-0875")));
		dataDosen.add(new ArrayList<String>(Arrays.asList(
				"Edi Nurachmad\t\t", "Taman Cimanggu Permai, Bogor\t\t", "+62 856-9380-0384")));
		
		for (int i = 0; i < dataDosen.size(); i++) {
			for (int j = 0; j < dataDosen.get(i).size(); j++) {
				System.out.print(dataDosen.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
