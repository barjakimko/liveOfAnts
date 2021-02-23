package com.codecool.ants.ants;

import com.codecool.ants.geometry.Position;

public abstract class Ant {
    public abstract void onUpdate();
    public abstract Position getPosition();
    public abstract String getSignature();
}
