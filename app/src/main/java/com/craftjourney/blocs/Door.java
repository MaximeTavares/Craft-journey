package com.craftjourney.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.craftjourney.exceptions.IllegalBlocException;
import com.craftjourney.exceptions.LockedDoorException;

public class Door extends Bloc {

    private static Logger logger = LogManager.getLogger(Door.class);

    private boolean isLocked;

    public Door(final int length, final int width, final int height, final boolean isLocked) throws IllegalBlocException {
        super(length, width, height);
        this.isLocked = isLocked;
        this.couleur = Couleur.BLEU; // Default color for doors
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

    public void locked() throws LockedDoorException {
        if (isLocked == false) {
            isLocked = true;
        } else {
            logger.error("Attempted to lock an already locked door.");
            throw new LockedDoorException();
        }
        
    }
    
}