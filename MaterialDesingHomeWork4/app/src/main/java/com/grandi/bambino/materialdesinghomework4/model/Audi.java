package com.grandi.bambino.materialdesinghomework4.model;

import android.graphics.drawable.Drawable;

public class Audi {

    private Drawable imageCar;
    private int text;

    public Audi(Drawable imageCar, int text){
        this.imageCar = imageCar;
        this.text = text;
    }

    public Drawable getImageCar() {
        return imageCar;
    }

    public void setImageCar(Drawable imageCar) {
        this.imageCar = imageCar;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }
}
