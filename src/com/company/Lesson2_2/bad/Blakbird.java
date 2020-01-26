package com.company.Lesson2_2.bad;

public class Blakbird {
    private final String name;
    private boolean isFlying;

    public Blakbird(String name) {
        this.name = "Blackbird";
        this.isFlying = false;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void feed() {
        isFlying = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }
}