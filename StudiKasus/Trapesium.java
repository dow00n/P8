package StudiKasus;

class Trapesium extends BangunDatar {
    private double alasAtas;
    private double alasBawah;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public Trapesium(double alasAtas, double alasBawah, double tinggi, double sisi1, double sisi2) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alasAtas + alasBawah + sisi1 + sisi2;
    }
}
