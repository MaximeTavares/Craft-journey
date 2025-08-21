package com.craftjourney;

import com.craftjourney.exceptions.IllegalBlocException;
import com.craftjourney.exceptions.LockedDoorException;

public class Main {
    public static void main(String[] args) {

        try {
            Door door = new Door(1, 1, 2, false);
            System.out.println(door.isLocked()); // Should print false
            door.locked(); // Lock the door
            System.out.println(door.isLocked()); // Should print true
            door.locked(); // Attempt to lock again, should throw exception
        } catch (LockedDoorException e) {
            System.out.println("Error: The door is already locked.");
        } catch (IllegalBlocException e) {
            System.out.println("Error: Illegal bloc dimensions.");
        }

    }
}