package com.mycompany;

import com.mycompany.animals.Dog;
import com.mycompany.animals.Elephant;
import com.mycompany.animals.Snake;
import com.mycompany.interfaces.Audible;
import com.mycompany.interfaces.Moveable;

import java.util.ArrayList;

/**
 * Created by korne on 10.05.2017.
 */
public class Zoo {
    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    private ArrayList<Elephant> elephants = new ArrayList<Elephant>();
    private ArrayList<Snake> snakes = new ArrayList<Snake>();

    public ArrayList<Moveable> getMoveables() {
        return moveables;
    }

    public void setMoveables(ArrayList<Moveable> moveables) {
        this.moveables = moveables;
    }

    public ArrayList<Audible> getAudibles() {
        return audibles;
    }

    public void setAudibles(ArrayList<Audible> audibles) {
        this.audibles = audibles;
    }

    //both lists keep objects from classes which implements interfaces ;) - hope u understood :D
    private ArrayList<Moveable> moveables = new ArrayList<Moveable>();
    private ArrayList<Audible> audibles = new ArrayList<Audible>();

    //my space for experiments
    public void init() {

        //created Dog object
        Dog dog = new Dog();
        dogs.add(dog);

        //created Elephant object
        Elephant elephant = new Elephant();
        elephants.add(elephant);

        //created Snake object
        Snake snake = new Snake();
        snakes.add(snake);


        moveables.add(dog);
        moveables.add(elephant);
        moveables.add(snake);

        audibles.add(dog);
        audibles.add(elephant);
        audibles.add(snake);
    }

    //use interface reference
    public void runAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.run();
        }
    }

    //use interface reference
    public void hideAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.hide();
        }
    }

    //use interface reference
    public void animalMakeNoiseByInterfaceRef() {
        for (Audible audible : audibles) {
            audible.makeNoise();
        }
    }


    //use object reference
    public void runAnimalsByObjectRef() {
        for (Dog dog : dogs) {
            dog.run();
        }

        for (Elephant elephant : elephants) {
            elephant.run();
        }

        for (Snake snake : snakes) {
            snake.run();
        }

    }

}
