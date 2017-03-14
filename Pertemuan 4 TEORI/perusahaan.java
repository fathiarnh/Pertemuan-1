public class perusahaan{
	public static void main(String[] args) {
		divisi dv = new divisi();
		gaji gj = new gaji();
		status st = new status();
		karyawan kr = new karyawan();
		pekerjaan kerja = new pekerjaan();
		quote q = new quote();

		q.isiMotto("Belajar Cerdaslah, sukses di depanmu!");

		System.out.println("\n\t============= DATA KARYAWAN PT.INDRAJAYA =============\n");
		kr.data_karyawan();
		dv.nama_divisi();
		gj.gj_pokok();
		st.nama_status();
		System.out.println("\t------------------------------------------------------");
		System.out.println("\tPekerjaan \t: "+kerja.bagian);
		System.out.println("\tPengalaman \t: "+q.pengalaman);
		System.out.println("\tMotto \t\t: "+q.motto);
		System.out.println("\n\t======================================================\n");
	}
}

class karyawan{
	private String nip,nama,tmp_lhr;
	private char jk;
	public char gol;
	public byte kd_status;
	public short kd_divisi;

	public void data_karyawan(){
		nip = "10115405";
		nama = "Fathia Rahma";
		tmp_lhr = "Bandung";
		jk = 'P';

		System.out.println("\tNIP \t\t: "+nip);
		System.out.println("\tNama \t\t: "+nama);
		System.out.println("\tTempat Lahir \t: "+tmp_lhr);
		System.out.println("\tJenis Kelamin \t: "+jk);
	}

	public void kode_divisi(){
		kd_divisi = 10115;
		System.out.println("\tKode Divisi \t: "+kd_divisi);
	}

	public void golongan(){
		gol = 'A';
		System.out.println("\tGolongan \t: "+gol);
	}

	public void kode_status(){
		kd_status = 1;
		System.out.println("\tKode Status \t: "+kd_status);
	}
}

class divisi{	
	public void nama_divisi(){
		String nama_divisi;
		karyawan kd = new karyawan();
		nama_divisi = "Keuangan";

		kd.kode_divisi();
		System.out.println("\tNama Divisi \t: "+nama_divisi);
	}
}

class gaji{	
	public void gj_pokok(){
		int gaji_pokok;
		int jam_shift;
		int bns;
		int tot_gaji;

		karyawan g = new karyawan();
		gaji_pokok = 3000000;
		jam_shift = 4;
		gaji bonus = new gaji();
		bns = bonus.bonus_shift(4);
		tot_gaji = bns + gaji_pokok;

		g.golongan();
		System.out.println("\tGaji Pokok \t: "+gaji_pokok);
		System.out.println("\tJam Shift \t: "+jam_shift+" jam");
		System.out.println("\tBonus \t\t: "+bns);
		System.out.println("\tGaji Total \t: "+tot_gaji);
	}
	private int bonus_shift(int x){
		return 50000*x;
	}
}

class status{
	public void nama_status(){
		String nama_status;
		karyawan s = new karyawan();
		nama_status = "Kontrak";

		s.kode_status();
		System.out.println("\tStatus \t\t: "+nama_status);
	}
}

class pekerjaan{
	String bagian;
	
	public pekerjaan(){
		bagian = "Designer Product, 2D/3D Animator";
	}
}

class quote{
	String motto;
	String pengalaman;

	public void isiMotto(String motto){
		this.motto = motto;
	}

	public quote(){
		this.pengalaman = "Pernah jadi Web Developer";
	}
}