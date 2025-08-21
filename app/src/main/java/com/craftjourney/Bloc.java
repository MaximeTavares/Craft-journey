package com.craftjourney;

import com.craftjourney.exceptions.IllegalBlocException;

public abstract class Bloc implements IBloc {

    protected int length;
    protected int width;
    protected int height;
    protected Couleur couleur;

    public Bloc(final int length, final int width, final int height) throws IllegalBlocException {
        if (length < MIN_LENGTH || width < MIN_WIDTH || height < MIN_HEIGHT) {
            throw new IllegalBlocException();
        }

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

}