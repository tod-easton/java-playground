package com.statefarm;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    //    Write a two-arg constructor that takes height and width, and then calls the other constructor to create a picture that is not framed.
    Picture(int height, int width) {
        this(false,height, width);
    }

    Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }
}
