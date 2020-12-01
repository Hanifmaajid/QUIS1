package hanif;

public class Android extends Ujian{

    public Android(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara) {
        super(nik, nama, tesTulis, tesCoding, tesWawancara);
    }

    @Override
    public void hasilUjian(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara) {
        double hasil = 0.2*tesTulis + 0.5*tesCoding + 0.3*tesWawancara;
        System.out.println("\n\nNilai Akhir : " + String.valueOf(hasil));
        System.out.println("KETERANGAN : " + (hasil >= 85? "LULUS" : "GAGAL"));
        System.out.println(hasil >= 85? 
                "Selamat kepada " + nama + " anda diterima sebagai Android Developer" : 
                "Mohon maaf kepada " + nama + " anda gagal sebagai Android Developer");
    }
    
}
