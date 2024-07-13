public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public void infoBuku() {
        System.out.println("Ini method info buku");
    }

    public void pinjamBuku() {
        System.out.println("Ini method pinjam buku");
    }

    public void kembalikanBuku() {
        System.out.println("Ini method kembalikan buku");
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void naikkanHarga(){
        System.out.println("Update buku set harga= where id=");
    }

    public void naikkanHarga(double kenaikan){
        System.out.println("Update buku set harga= where id=");
    }

    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}
