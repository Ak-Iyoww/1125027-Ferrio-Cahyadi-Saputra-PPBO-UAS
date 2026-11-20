package model;

public class Kubus extends Object3D {
    private double sisi;

    public Kubus(double sisi,String label){
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
    public double hitungLuasPermukaan(){
        return 6*(sisi*sisi);
    }

    @Override
    public double hitungVolume(){
        return (sisi*sisi*sisi);
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Kubus"},
            {"sisi", String.valueOf(sisi)}
        };
    }

}
