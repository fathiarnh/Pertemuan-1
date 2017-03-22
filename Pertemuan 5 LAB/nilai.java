import java.util.Scanner;

public class nilai{

	public static void main(String[] args) {
		int n,i;
		char pil;
		Scanner input  = new Scanner(System.in);

		System.out.print("\nMasukan Jumlah Data = ");
		n = input.nextInt();
		System.out.print("Pilihan (A/B)       = ");
		pil = input.next().charAt(0);
        System.out.println("---------------------------------");        
                
        int []angka = new int[n];
		for(i=0;i<n;i++){
			System.out.print("Masukan Data ke - "+(i+1)+" : ");
			angka[i] = input.nextInt();
		}
        System.out.println("---------------------------------");        
        int min = angka[0];
        int max = angka[0];
        int tampil = 0;

		if(pil == 'A' || pil == 'a'){
			for(i = 0; i<n;i++){
				if(min > angka[i]){
					min = angka[i];
					tampil = 1;
				}else if (min == angka[i]) {
					tampil++;
				}
        	}
	        System.out.println("Nilai Minimum       = "+min);
	        System.out.println("Jumlah Data Minimum = "+tampil);
		}

		if(pil == 'B' || pil == 'b'){
            for(i = 0; i<n;i++){
				if(max < angka[i]){
					max = angka[i];
					tampil = 1;
				}else if (max == angka[i]){
					tampil++;
				}
            }
            System.out.println("Nilai Maksimum       = "+max);
            System.out.println("Jumlah Data Maksimum = "+tampil);
        }

	}
}

/*class choose{
	public void pilihanA(){
		for(i = 0; i<n;i++){
			if(min > angka[i]){
				min = angka[i];
			}
        }
        System.out.println("nilai Minimum = "+min);
	}

	public void pilihanB(){
		for(i = 0; i<n;i++){
				if(max < angka[i]){
					max = angka[i];
				}
            }
            System.out.println("nilai Maksimum = "+max);
	}
}*/