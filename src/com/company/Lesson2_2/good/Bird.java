package com.company.Lesson2_2.good;

public abstract class Bird {
    private final String name;
    private boolean isFlying;

    public Bird(String name){
        this.name = name;
        this.isFlying = false;
    }

    public boolean isFlying(){
        return isFlying;
    }

    public abstract void feed();

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

     void setFlying(boolean flying){
        isFlying = flying;
    }
}
