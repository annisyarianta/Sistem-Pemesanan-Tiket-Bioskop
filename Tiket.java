public class Tiket extends User {
    private String judul;
    private String jam;
    private int hargaTiket;
    private int jumlahTiket;
    private int totalHarga;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getJudul(){
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}
