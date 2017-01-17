package com.drool.test.state.session;

/**
 * Created by umesh on 10/24/16.
 */
public class Sprinkler {

    public Sprinkler(Room room) {
        this.room = room;
    }

    private Room room;
    private boolean on;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
