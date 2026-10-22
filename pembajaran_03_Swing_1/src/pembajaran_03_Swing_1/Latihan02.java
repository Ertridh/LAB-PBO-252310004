package pembajaran_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan02 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		Biodata mahasiswa = new Biodata();
		

		mahasiswa.fullName = jop.showInputDialog(
				null, 
				"Masukkan nama lengkap anda",
				"Input",
				jop.QUESTION_MESSAGE
				);
		
		mahasiswa.usia = Integer.parseInt(jop.showInputDialog(
				null,
				"Masukkan usia anda"
				));
		
		mahasiswa.alamat = jop.showInputDialog(
				null,
				"Masukkan alamat anda"
				);
		
		String output = "Nama lengkap: " + mahasiswa.getFullName() + "\n" +
						"Usia: " + mahasiswa.getUsia() + "\n" +
						"Alamat: " + mahasiswa.getAlamat();
		
		jop.showMessageDialog(null, output, "Biodata", jop.INFORMATION_MESSAGE);
	}
}

