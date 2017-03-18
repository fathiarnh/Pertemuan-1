import java.util.Scanner; 

public class ipk{
	public static void main(String[] args) {
		ipk ipmhs = new ipk();

		Scanner input = new Scanner(System.in);
		float ip = 0, jumlah = 0, rata2 = 0;
		int mhs = 0, lulus = 0, gagal = 0;
		boolean keluar = false;

		System.out.println("\n\t========== IPK MAHASISWA ==========");
		System.out.print("\tMasukan jumlah ipk \t: ");
		
		ip = input.nextFloat();
		while(ip !=- 999){
			if(ipmhs.isWithinRange(ip,0,4) == 1){
				mhs++;
				if(ip>=2.75){
					lulus++;
				}else{
					gagal++;
				}
				jumlah += ip;
			}
			System.out.print("\tMasukan jumlah ipk \t: ");
			ip = input.nextFloat();
		}
		rata2 = jumlah/mhs;
		System.out.println("\n\t-----------------------------------");
		System.out.println("\n\tJumlah Mahasiswa \t: "+mhs);
		System.out.println("\tMahasiswa yang lulus \t: "+lulus);
		System.out.println("\tMahasiswa yang tidak lulus : "+gagal);
		System.out.println("\tRata-Rata ipk \t\t: "+rata2);
		System.out.println("\t-----------------------------------");
	}

	public int isWithinRange(float x, int min, int max){
		if(x >= min && x <= max){
			return 1;
		}else{
			return 0;
		}
	}
}