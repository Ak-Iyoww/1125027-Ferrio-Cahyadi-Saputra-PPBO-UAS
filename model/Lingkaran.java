package model;

public class Lingkaran extends Object2D {
    private double jarijari;

    public Lingkaran(String label, double jarijari) {
        super(label);
        this.jarijari = jarijari;
    }

    public double getjarijari() {
        return jarijari;
    }

    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jarijari;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Lingkaran"},
            {"jari-jari", String.valueOf(jarijari)}
        };
    }
}
