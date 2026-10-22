package pembajaran_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan04 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		Biodata mahasiswa = new Biodata();
		int confirm = 0;
		int confirm2 = 0;
		int confirm3 = 0;
		int confirm4 = 0;
		
		do {
			do {
				mahasiswa.fullName = jop.showInputDialog(
						null, 
						"Masukkan nama lengkap anda",
						"Input",
						jop.INFORMATION_MESSAGE
						);
				
				if (mahasiswa.fullName == null) {
					confirm = jop.showConfirmDialog(
							null, 
							"Apakah anda ingin keluar?",
							"Konfirmasi",
							jop.YES_NO_OPTION);
					if (confirm == 0) {
						return;
					}
				}
			} while (confirm != 0);
			
			do {
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
				
				if (mahasiswa.usiaInput == null) {
					confirm2 = jop.showConfirmDialog(
							null, 
							"Apakah anda ingin keluar?",
							"Konfirmasi",
							jop.YES_NO_OPTION);
					if (confirm2 == 0) {
						return;
					}
				}
			} while (confirm2 != 0);
			
			do {
				mahasiswa.alamat = jop.showInputDialog(
						null,
						"Masukkan alamat anda"
						);
				if (mahasiswa.alamat == null) {
					confirm3 = jop.showConfirmDialog(
							null, 
							"Apakah anda ingin keluar?",
							"Konfirmasi",
							jop.YES_NO_OPTION);
					if (confirm3 == 0) {
						return;
					}
				}
			} while (confirm3 != 0);
			
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
				return;
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
			
			confirm4 = jop.showConfirmDialog(
					null, 
					"Apakah anda ingin keluar?",
					"Konfirmasi",
					jop.YES_NO_OPTION);
			if (confirm4 == 0) {
				return;
			}
		} while (confirm4 != 0);
	}
}
