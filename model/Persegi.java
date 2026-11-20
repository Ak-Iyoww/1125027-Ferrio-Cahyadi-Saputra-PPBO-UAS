package model;

public class SegiEmpat extends Object2D {
    private double sisi;

    public SegiEmpat(double sisi,String label){
        this.sisi=sisi;
        super(label);
    }

    public double getsisi() {
        return sisi;
    }

    public void setsisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }

    public double hitungKeliling(){
        return sisi*4;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Persegi"},
            {"sisi", String.valueOf(sisi)},
        };
    }

}
