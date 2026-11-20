package model;

public abstract class Object3D extends Gobject{
    public Object3D(String label){
        super (label);
    }

    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();

    @Override
    public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        return new String[][] {
            parentDetails[0],
            {"Volume", String.format("%.2f", hitungVolume())},
            {"Luas Permukaan", String.format("%.2f", hitungLuasPermukaan())}
        };
    }
}
