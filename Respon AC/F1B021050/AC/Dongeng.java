package AC;

abstract class Dongeng implements KetBuku, CetakBuku {
    protected String judul;
    protected String penulis;
    protected int tahun;
    protected double harga;

    public Dongeng(String judul, String penulis, int tahun, double harga){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.harga = harga;
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
}
