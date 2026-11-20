package model;

public abstract class Object2D extends Gobject{
    public Object2D(String label){
        super (label);
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        return new String[][] {
            parentDetails[0],
            {"luas", String.format("%.2f", hitungLuas())},
            {"keliling", String.format("%.2f", hitungKeliling())}
        };
    }
}
