package model;

public class Balok extends Object3D {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang,double tinggi,double lebar,String label){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
        super(label);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }



    @Override
    public double hitungLuasPermukaan(){
        return 2*(panjang*lebar+panjang*tinggi+tinggi*lebar);
    }

    @Override
    public double hitungVolume(){
        return panjang*lebar*tinggi;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Balok"},
            {"panjang", String.valueOf(panjang)},
            {"lebar", String.valueOf(lebar)},
            {"tinggi", String.valueOf(tinggi)}
        };
    }

}
