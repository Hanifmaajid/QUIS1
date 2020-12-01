package hanif;

public class Web extends Ujian{

    public Web(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara) {
        super(nik, nama, tesTulis, tesCoding, tesWawancara);
    }

    @Override
    public void hasilUjian(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara) {
        double hasil = 0.4*tesTulis + 0.35*tesCoding + 0.25*tesWawancara;
        System.out.println("\n\nNilai Akhir : " + String.valueOf(hasil));
        System.out.println("KETERANGAN : " + (hasil >= 85? "LULUS" : "GAGAL"));
        System.out.println(hasil >= 85? 
                "Selamat kepada " + nama + " anda diterima sebagai Web Developer" : 
                "Mohon maaf kepada " + nama + " anda gagal sebagai Web Developer");
    }
    
}
