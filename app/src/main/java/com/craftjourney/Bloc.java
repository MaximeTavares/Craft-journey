package com.craftjourney;

public abstract class Bloc implements IBloc {

    protected int length;
    protected int width;
    protected int height;

    public Bloc(final int length, final int width, final int height) {
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

}
