package latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;
    
    // Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Kelas: " + kelas);
    }
}