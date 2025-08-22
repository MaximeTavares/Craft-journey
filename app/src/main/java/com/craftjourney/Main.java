package com.craftjourney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.craftjourney.blocs.Door;
import com.craftjourney.exceptions.IllegalBlocException;
import com.craftjourney.exceptions.LockedDoorException;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        
        logger.info("App started.");

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

        logger.info("App ended.");

    }
}