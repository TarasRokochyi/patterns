package org.example.creational.builder;

public interface RoomBuilder {

    void buildBed();
    void buildDrawer();
    void buildMirror();
    void buildDesk();
    Room getRoom();

}
