public class Pengguna {
    private int id;
    private String username;
    private String password;

    public void login() {
        System.out.println("Ini method untuk login");
    }

    public void lupaPassword() {
        System.out.println("Ini method lupa password");
    }

    public void daftar() {
        System.out.println("Ini method Daftar user baru");
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Pengguna(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHERE id = " + id);
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username = " + username);
    }

    public void login(String tokenGoogle){
        System.out.println("Ini Login menggunakan Google");
    }
}