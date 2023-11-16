package StudiKasus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====================");
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Trapesium");
            System.out.println("6. Jajar Genjang");
            System.out.println("0. Keluar");
            System.out.println("====================");

            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program!");
                break;
            } else if (pilihan >= 7) {
                System.out.println("Pilihan tidak tersedia, coba lagi.");
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisiPersegi = scanner.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas\t: "+persegi.hitungLuas());
                    System.out.println("Keliling: "+persegi.hitungKeliling());
                    break;

                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjangPersegiPanjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebarPersegiPanjang = scanner.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Luas\t: " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
                    break;

                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    double alasSegitiga = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggiSegitiga = scanner.nextDouble();
                    System.out.print("Masukkan sisi1 segitiga: ");
                    double sisi1Segitiga = scanner.nextDouble();
                    System.out.print("Masukkan sisi2 segitiga: ");
                    double sisi2Segitiga = scanner.nextDouble();
                    System.out.print("Masukkan sisi3 segitiga: ");
                    double sisi3Segitiga = scanner.nextDouble();
                    Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, sisi1Segitiga, sisi2Segitiga, sisi3Segitiga);
                    System.out.println("Luas\t: "+segitiga.hitungLuas());
                    System.out.println("Keliling: "+segitiga.hitungKeliling());
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = scanner.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                    System.out.println("Luas\t: " + lingkaran.hitungLuas());
                    System.out.println("Keliling: " + lingkaran.hitungKeliling());
                    break;

                case 5:
                    System.out.print("Masukkan alas atas trapesium: ");
                    double alasAtasTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan alas bawah trapesium: ");
                    double alasBawahTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi1 trapesium: ");
                    double sisi1Trapesium = scanner.nextDouble();
                    System.out.print("Masukkan sisi2 trapesium: ");
                    double sisi2Trapesium = scanner.nextDouble();
                    Trapesium trapesium = new Trapesium(alasAtasTrapesium, alasBawahTrapesium, tinggiTrapesium, sisi1Trapesium, sisi2Trapesium);
                    System.out.println("Luas\t: " + trapesium.hitungLuas());
                    System.out.println("Keliling: " + trapesium.hitungKeliling());
                    break;

                case 6:
                    System.out.print("Masukkan alas jajar genjang: ");
                    double alasJajarGenjang = scanner.nextDouble();
                    System.out.print("Masukkan tinggi jajar genjang: ");
                    double tinggiJajarGenjang = scanner.nextDouble();
                    System.out.print("Masukkan sisi1 jajar genjang: ");
                    double sisi1JajarGenjang = scanner.nextDouble();
                    System.out.print("Masukkan sisi2 jajar genjang: ");
                    double sisi2JajarGenjang = scanner.nextDouble();
                    JajarGenjang jajarGenjang = new JajarGenjang(alasJajarGenjang, tinggiJajarGenjang, sisi1JajarGenjang, sisi2JajarGenjang);
                    System.out.println("Luas\t: " + jajarGenjang.hitungLuas());
                    System.out.println("Keliling: " + jajarGenjang.hitungKeliling());
                    break;
            }
        }
        scanner.close();
    }
}
