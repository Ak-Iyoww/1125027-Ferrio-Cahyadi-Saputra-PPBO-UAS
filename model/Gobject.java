package model;

abstract class Gobject implements KeyValueDetails {
    private String label;

    public Gobject(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    String[][] getKeyValueDetails(){
        return new String[][] {
            {"label", this.label}
        };
    }
}
