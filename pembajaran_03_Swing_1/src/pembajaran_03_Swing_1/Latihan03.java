package pembajaran_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		Biodata mahasiswa = new Biodata();
		
		mahasiswa.fullName = jop.showInputDialog(
				null, 
				"Masukkan nama lengkap anda",
				"Input",
				jop.QUESTION_MESSAGE
				);
		
		mahasiswa.usiaInput = jop.showInputDialog(
				null,
				"Masukkan usia anda"
				);
		
		try {
            mahasiswa.usia = Integer.parseInt(mahasiswa.usiaInput.trim());

            if (mahasiswa.usia < 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "Isian usia harus angka",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Isian usia harus angka",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
		
		mahasiswa.alamat = jop.showInputDialog(
				null,
				"Masukkan alamat anda"
				);
		
		if (mahasiswa.fullName.trim().isEmpty() || mahasiswa.usiaInput.trim().isEmpty() || mahasiswa.alamat.trim().isEmpty()) {
			jop.showMessageDialog(
					null, 
					"Field [nama lengkap/usia/alamat] tidak boleh kosong",
					"Error",
					jop.ERROR_MESSAGE);
		} else if (mahasiswa.alamat.trim().length() < 10) {
			jop.showMessageDialog(
					null, 
					"Masukan alamat minimum 10 karakter",
					"Error",
					jop.ERROR_MESSAGE);
		} else {
			String output = "Nama lengkap: " + mahasiswa.getFullName() + "\n" +
					"Usia: " + mahasiswa.getUsia() + "\n" +
					"Alamat: " + mahasiswa.getAlamat();
	
			jop.showMessageDialog(
					null, 
					output, 
					"Biodata", 
					jop.INFORMATION_MESSAGE);
		}
	}
}
