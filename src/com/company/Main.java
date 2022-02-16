package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        Shark[] sharks = {(Shark) animals[0]};
        Turtle[] turtles = {(Turtle) animals[1]};
        Eagle[] eagles = {(Eagle) animals[2]};

        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("homework18 .Shark")) {
                ((Shark) a).attack();
            }
                if (a instanceof Turtle) {
                    ((Turtle) a).swim();
                }
                if (a.getClass().getName().equals(("homework18. Turtle"))) {
                    ((Turtle) a).swim();
                }
                if (a instanceof Eagle) {
                    ((Eagle) a).fly();
                }
                if (a.getClass().getName().equals(("homework18. Eagle"))) {
                    ((Eagle) a).fly();
                }


            }


        }
    }

