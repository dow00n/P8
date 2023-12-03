package AC;

public class Main {
    public static void main(String[] args) {
        Fabel fabel = new Fabel("Kancil dan Buaya", "Adi Nata", 2007, 50000, "Fabel");
        Legenda legenda = new Legenda("Danau Toba", "Radita Una", 2004, 45000, "Legenda");

        System.out.println("=================================================");
        System.out.println("Judul\t\t:"+fabel.getJudul());
        System.out.println("Penulis\t\t:"+fabel.getPenulis());
        System.out.println("Tahun Terbit\t:"+fabel.getTahun());
        System.out.println("Harga\t\t:Rp."+fabel.getHarga());
        System.out.println("Jenis\t\t:"+fabel.getJenis());
        System.out.println("-------------------------------------------------");
        fabel.cetakA5();
        System.out.println("-------------------------------------------------");
        System.out.println("Judul\t\t:"+legenda.getJudul());
        System.out.println("Penulis\t\t:"+legenda.getPenulis());
        System.out.println("Tahun Terbit\t:"+legenda.getTahun());
        System.out.println("Harga\t\t:Rp."+legenda.getHarga());
        System.out.println("Jenis\t\t:"+legenda.getJenis());
        System.out.println("-------------------------------------------------");
        legenda.cetakB4();
        System.out.println("=================================================");
    }
}
