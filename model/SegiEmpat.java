package model;

public class SegiEmpat extends Object2D {
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang,double lebar,String label){
        this.panjang=panjang;
        this.lebar=lebar;
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


    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }

    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parent = super.getKeyValueDetails();
        return new String[][] {
            parent[0],
            parent[1],
            parent[2],
            {"tipe", "Segi Empat"},
            {"panjang", String.valueOf(panjang)},
            {"lebar", String.valueOf(lebar)}
        };
    }

}
