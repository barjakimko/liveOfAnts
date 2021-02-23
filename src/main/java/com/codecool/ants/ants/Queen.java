package com.codecool.ants.ants;

import com.codecool.ants.geometry.Position;

import java.util.Random;

public class Queen extends Ant {

    Random rand = new Random();
    private final Position position;
    private int timeStep = resetTimeStep();
    private final String SIGNATURE = "Q";
    public Queen(int width) {
        this.position = new Position(width / 2 , width / 2 );
    }

    @Override
    public void onUpdate() {
        timeStep--;
        if (timeStep == 0) {
            timeStep = resetTimeStep();
        }
    }

    public Position getPosition() {
        return position;
    }

    private int resetTimeStep() {
        int MAX = 100;
        int MIN = 50;
        return rand.nextInt((MAX - MIN) + 1) + MIN;
    }

    public String getSignature() {
        return SIGNATURE;
    }
}
