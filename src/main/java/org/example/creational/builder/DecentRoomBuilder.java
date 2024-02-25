package org.example.creational.builder;

public class DecentRoomBuilder implements RoomBuilder {

    private Room room = null;

    public DecentRoomBuilder(){
        room = new Room();
    }


    @Override
    public void buildBed() {
        room.setBed("Divan");
    }

    @Override
    public void buildDrawer() {
        room.setDrawer("Gentleman`s Chest");
    }

    @Override
    public void buildMirror() {
        room.setMirror("Big Mirror");
    }

    @Override
    public void buildDesk() {
        room.setDesk("Adjustable Desk");
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
