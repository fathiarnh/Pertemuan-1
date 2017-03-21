class data{
	String kode_barang,jenis,nama,no_nota,tgl_order,tgl_selesai,header;
	int harga,jml_barang,total;


	public void barang(){
		System.out.println("Kode Barang  : "+kode_barang);
		System.out.println("Jenis Barang : "+jenis);
		System.out.println("Nama Barang  : "+nama);
		System.out.println("Harga Barang : "+harga);

	}

	public void transaksi(){
		System.out.println("No Nota         : "+no_nota);
		System.out.println("Tanggal Order   : "+tgl_order);
		System.out.println("Tanggal Selesai : "+tgl_selesai);
		System.out.println("Jumlah Barang 	: "+jml_barang);
		System.out.println("Total Harga 	: "+harga*jml_barang);
	}

	public data(String header){
		this.header = header;
	}

	public void batas(){
		System.out.println("\n=========== "+header+" ==========\n");
	}
}

public class laundry extends data{
	
	int harga = 4000;
	int jml_barang = 3;

	public void barang(){
		kode_barang = "BJ01";
		jenis = "Satuan";
		nama = "Baju";
		super.harga = harga;
		super.barang();
	}

	public void transaksi(){
		no_nota = "P1053";
		tgl_order = "22-01-2017";
		tgl_selesai = "27-01-2017";
		super.harga = harga;
		super.jml_barang = jml_barang;
		super.transaksi();
	}

	public laundry(String head){
		super(head);
	}

	public static void main(String[] args) {
		laundry d = new laundry("DATA LAUNDRY");
		d.batas();
		d.barang();
		System.out.println("\n===================================\n");
		d.transaksi();
		System.out.println("\n===================================\n");
	}
}