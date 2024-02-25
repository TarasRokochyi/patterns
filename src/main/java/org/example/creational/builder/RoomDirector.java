package org.example.creational.builder;

public class RoomDirector {

    private RoomBuilder roomBuilder = null;

    public RoomDirector(RoomBuilder roomBuilder){
        this.roomBuilder = roomBuilder;
    }

    public void constructRoom(){
        roomBuilder.buildBed();
        roomBuilder.buildDrawer();
        roomBuilder.buildMirror();
        roomBuilder.buildDesk();
    }

    public Room getRoom(){
        return roomBuilder.getRoom();
    }
}
