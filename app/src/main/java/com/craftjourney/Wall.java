package com.craftjourney;

import com.craftjourney.exceptions.IllegalBlocException;

public class Wall extends Bloc {

    private boolean isSolid;

    public Wall(final int length, final int width, final int height, final boolean isSolid) throws IllegalBlocException {
        super(length, width, height);
        this.isSolid = isSolid;
        this.couleur = Couleur.GRIS; // Default color for walls
    }

    @Override
    public void displayDescription() {
        System.out.println("This is a wall.");
    }

    public void displayInfo() {
        System.out.println(
                "Wall Info: Length = " + getLength() +
                        ", Width = " + getWidth() +
                        ", Height = " + getHeight() +
                        ", Is Solid = " + isSolid);
    }

    public boolean isPassable() {
        return !isSolid;
    }
}
