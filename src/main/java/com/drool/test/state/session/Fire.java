package com.drool.test.state.session;

/**
 * Created by umesh on 10/24/16.
 */
public class Fire {

    public Fire(Room room) {
        this.room = room;
    }

    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
