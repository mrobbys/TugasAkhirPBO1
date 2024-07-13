public class Majalah{
    private int id;
    private String judul;     
    private String ISSN;
    private int jumlahHalaman;
    private double harga;

    public void infoMajalah(){
        System.out.println("Ini method info majalah");
    }

    public void pinjamMajalah(){
        System.out.println("Ini method pinjam majalah");
    }

    public void kembalikanMajalah(){
        System.out.println("Ini method kembalikan majalah");
    }

    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getISSN(){
        return this.ISSN;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setISSN(String ISSN){
        this.ISSN = ISSN;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void naikkanHarga(){
        System.out.println("Update Majalah set harga= where id=");
    }

    public void  naikkanHarga(double kenaikan){
        System.out.println("Update Majalah set harga= where id=");
    }

    public Majalah(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

}