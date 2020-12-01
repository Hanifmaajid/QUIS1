package hanif;

public abstract class Ujian {
    public String nik;
    public String nama;
    public double tesTulis;
    public double tesCoding;
    public double tesWawancara;

    public Ujian(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.tesTulis = tesTulis;
        this.tesCoding = tesCoding;
        this.tesWawancara = tesWawancara;
    }
    
    public void editUjian (double tesTulis, double tesCoding, double tesWawancara){
        this.tesTulis = tesTulis;
        this.tesCoding = tesCoding;
        this.tesWawancara = tesWawancara;
    }
        
    public abstract void hasilUjian(String nik, String nama, double tesTulis, double tesCoding, double tesWawancara);
}
