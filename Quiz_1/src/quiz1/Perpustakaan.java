package quiz1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Perpustakaan {

	public static void main(String[] args) {
		String pilihMenu;
		String indexBuku;
		
		ArrayList<String> buku = new ArrayList<String>();
		JOptionPane jop = new JOptionPane();
		
		jop.showMessageDialog(
				null, 
				"Sistem Inventori Buku Perpustakaan",
				"Selamat Datang",
				jop.INFORMATION_MESSAGE);
		
		do {
			pilihMenu = jop.showInputDialog(
						null,
						"Pilih Menu:\n"
						+ "1. Memasukkan buku\n"
						+ "2. Mencari buku\n"
						+ "3. List semua buku\n"
						+ "4. Keluar dari program",
						"Menu",
						jop.INFORMATION_MESSAGE);
			
			switch (pilihMenu) {
				case "1":
					buku.add(jop.showInputDialog(null, "Masukkan nama buku: "));
					jop.showMessageDialog(null, "Buku berhasil dimasukkan");						
				case "2":
					indexBuku = jop.showInputDialog(null, "Masukkan index buku: ");
					jop.showMessageDialog(
							null, 
							buku.get(Integer.parseInt(indexBuku)));
				case "3":
					for (int i = 0; i < buku.size(); i++) {
						jop.showMessageDialog(null, "List Buku:\n"
								+ buku.get(i) + "\n");
					}
				case "4":
					return;
			}
			
		} while(pilihMenu != "4");
	}

}
