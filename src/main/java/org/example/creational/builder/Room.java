package org.example.creational.builder;

public class Room {
    private String Bed;
    private String Drawer;
    private String Mirror;
    private String Desk;

    public String getBed() {
        return Bed;
    }

    public void setBed(String bed) {
        Bed = bed;
    }

    public String getDrawer() {
        return Drawer;
    }

    public void setDrawer(String drawer) {
        Drawer = drawer;
    }

    public String getMirror() {
        return Mirror;
    }

    public void setMirror(String mirror) {
        Mirror = mirror;
    }

    public String getDesk() {
        return Desk;
    }

    public void setDesk(String desk) {
        Desk = desk;
    }

    @Override
    public String toString(){
        return "Bed: "+Bed+", Drawer: "+Drawer+", Mirror: "+Mirror+", Desk: "+Desk;
    }
}
