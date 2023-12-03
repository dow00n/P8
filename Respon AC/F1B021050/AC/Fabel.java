package AC;

public class Fabel extends Dongeng {
    private String jenis;

    public Fabel(String judul, String penulis, int tahun, double harga, String jenis) {
        super(judul, penulis, tahun, harga);
        this.jenis = jenis;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public int getTahun(){
        return tahun;
    }

    public double getHarga(){
        return harga;
    }

    public String getJenis(){
        return jenis;
    }

    @Override
    public void cetakA5() {
    System.out.println("Buku fabel ini akan dicetak dengan ukuran A5 !");
    }

    @Override
    public void cetakB4() {
    System.out.println("Buku fabel ini akan dicetak dengan ukuran B4 !");
    }
}
