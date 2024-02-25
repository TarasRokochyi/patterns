package org.example.creational.builder;

public class CheapRoomBuilder implements RoomBuilder {

    private Room room = null;

    public CheapRoomBuilder(){
        room = new Room();
    }
    @Override
    public void buildBed() {
        room.setBed("Folding Bed");
    }

    @Override
    public void buildDrawer() {
        room.setDrawer("Bachelor`s Chest");
    }

    @Override
    public void buildMirror() {
        room.setMirror("Small Mirror");
    }

    @Override
    public void buildDesk() {
        room.setDesk("writing desk");
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
