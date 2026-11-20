package model;

public class Kerucut extends Object3D {
    private double jarijari;
    private double tinggi;

    public Kerucut(double jarijari,double tinggi,String label){
        this.jarijari=jarijari;
        this.tinggi=tinggi;
        super(label);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }

    public double getjarijari() {
        return jarijari;
    }

    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuasPermukaan(){
        return 3.14*(jarijari*(tinggi+jarijari));
    }

    @Override
    public double hitungVolume(){
        return 1/3*3.14*(jarijari*jarijari)*tinggi;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Kerucut"},
            {"jarijari", String.valueOf(jarijari)},
            {"tinggi", String.valueOf(tinggi)}
        };
    }

}
