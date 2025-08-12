package com.craftjourney;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(10, 5, 3, true);
        wall.displayDescription();
        wall.displayInfo();

        System.out.println("Is the wall passable? " + wall.isPassable());

        Door door = new Door(2, 1, 3, false);
        door.displayDescription();
        door.displayInfo();

        System.out.println("Is the door locked? " + door.isLocked());

    }
}