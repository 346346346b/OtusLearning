package com.company.Lesson2_2.bad;

public class Bird {
    private final String name;
    private boolean isFlying;

    public Bird(String name){
        this.name = name;
        this.isFlying = false;
    }
    public boolean isFlay(){
        return isFlying;
    }

    public void feed(){
        if ((name.equals("Blackbird"))){
            isFlying = true;
        }
        else {
            isFlying = true;
        }


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
