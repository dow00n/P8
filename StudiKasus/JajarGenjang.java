package StudiKasus;

class JajarGenjang extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public JajarGenjang(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double hitungLuas() {
        return alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisi1 + sisi2);
    }
}

