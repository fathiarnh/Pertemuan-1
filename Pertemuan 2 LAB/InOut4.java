import javax.swing.JOptionPane;
import java.util.Scanner;


class InOut4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama;
		char jk;
		int tinggiBadan;
		//boolean menikah;

		System.out.println("\t=================");
		System.out.print("\tBelajar Java Yuks\n");
		System.out.println("\t=================");
		
		System.out.print("\tMasukan Nama \t\t: ");
		nama = input.nextLine();

		System.out.print("\tMasukan Jenis Kelamin \t: ");
		jk = input.next().charAt(0);

		System.out.print("\tMasukan Tinggi Badan \t: ");
		tinggiBadan = input.nextInt();

		//System.out.print("\tMasukan Status Menikah : ");
		//menikah = input.nextBoolean();

		System.out.println("\n\t"+nama);
		System.out.println("\t"+jk);
		System.out.println("\t"+tinggiBadan);
		//System.out.println("\t"+menikah);


		JOptionPane.showMessageDialog(null,nama+" sedang belajar Java","Salam",1);
		System.exit(0);


	}
}