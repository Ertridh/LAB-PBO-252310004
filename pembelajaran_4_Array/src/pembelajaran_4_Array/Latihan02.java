
package pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {
    	JOptionPane jop = new JOptionPane();
        ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matriksB = new ArrayList<>();
        ArrayList<ArrayList<Integer>> hasilMatriks = new ArrayList<>();
        int a, b;

        for (int i = 0; i < 2; i++) {
            matriksA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                a = Integer.parseInt(jop.showInputDialog(
                        null,
                        "Masukkan elemen a[" + i + "][" + j + "]",
                        "Matriks A",
                        jop.INFORMATION_MESSAGE
                    )
                );
                matriksA.get(i).add(a);
            }
        }
        
        for (int i = 0; i < 2; i++) {
            matriksB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                b = Integer.parseInt(jop.showInputDialog(
                        null,
                        "Masukkan elemen b[" + i + "][" + j + "]",
                        "Matriks B",
                        jop.INFORMATION_MESSAGE
                    )
                );
                matriksB.get(i).add(b);
            }
        }

        for (int i = 0; i < 2; i++) {
        	hasilMatriks.add(new ArrayList<>());
        	for (int j = 0; j < 2; j++) {
        		int total = 0;
        		for (int k = 0; k < 2; k++) {
        			total += matriksA.get(i).get(k)
        					*matriksB.get(k).get(j);
        		}
        		hasilMatriks.get(i).add(total);
        	}
        }
        
        StringBuilder hasilMatriksA = new StringBuilder();
        StringBuilder hasilMatriksB = new StringBuilder();
        StringBuilder hasilPerkalian = new StringBuilder();

        hasilMatriksA.append("Matriks A:\n");
        for (int k = 0; k < matriksA.size(); k++) {
            for (int l = 0; l < matriksA.get(k).size(); l++) {
            	hasilMatriksA.append(matriksA.get(k).get(l)).append("   ");
            }
            hasilMatriksA.append("\n");
        }
        
        hasilMatriksB.append("Matriks B:\n");
        for (int k = 0; k < matriksB.size(); k++) {
            for (int l = 0; l < matriksB.get(k).size(); l++) {
            	hasilMatriksB.append(matriksB.get(k).get(l)).append("   ");
            }
            hasilMatriksB.append("\n");
        }
        
        hasilPerkalian.append("Matriks C\n");
        for (int k = 0; k < hasilMatriks.size(); k++) {
            for (int l = 0; l < hasilMatriks.get(k).size(); l++) {
            	hasilPerkalian.append(hasilMatriks.get(k).get(l)).append("   ");
            }
            hasilPerkalian.append("\n");
        }

        jop.showMessageDialog(
            null,
            hasilMatriksA.toString()
            +"\n"
            +hasilMatriksB.toString()
            +"\n"
            +hasilPerkalian.toString(),
            "Hasil",
            jop.INFORMATION_MESSAGE
        );
    }
}
