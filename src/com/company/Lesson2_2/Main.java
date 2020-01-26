package com.company.Lesson2_2;

import com.company.Lesson2_2.good.Bird;
import com.company.Lesson2_2.good.Blakbird;
import com.company.Lesson2_2.good.Crow;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Crow("Crow"),
                new Blakbird("Blackbird")
        };

        birds[0].feed();
        birds[1].feed();

        new Main().print(birds);

    }

    private void print(Bird[] birds){
        for (Bird bird : birds){
            System.out.println(bird.toString());
        }
    }
}
