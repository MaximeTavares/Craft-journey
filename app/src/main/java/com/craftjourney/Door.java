package com.craftjourney;

public class Door extends Bloc {

    private boolean isLocked;

    public Door(final int length, final int width, final int height, final boolean isLocked) {
        super(length, width, height);
        this.isLocked = isLocked;
    }

    @Override
    public void displayDescription() {
        System.out.println("This is a door.");
    }

    public void displayInfo() {
        System.out.println(
                "Door Info: Length = " + getLength() +
                        ", Width = " + getWidth() +
                        ", Height = " + getHeight() +
                        ", Is Locked = " + isLocked);
    }

    public boolean isLocked() {
        return isLocked;
    }
    
}