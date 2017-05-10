package com.mycompany;

import com.mycompany.animals.Dog;
import com.mycompany.animals.Elephant;
import com.mycompany.animals.Snake;
import com.mycompany.interfaces.Audible;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args)
    {
        Zoo zoo = new Zoo();  //created class Zoo
        zoo.init(); //my 'main' method - runs my program

        //zoo.runAnimalsByObjectRef();
        //zoo.runAnimalsByInterfaceRef();
        //zoo.hideAnimalsByInterfaceRef();
        zoo.animalMakeNoiseByInterfaceRef();

        Audible someAnimal = zoo.getAudibles().get(0);
        System.out.println(someAnimal.getClass().getSimpleName());


        //casting from interface to Dog
        Dog myDog = (Dog) someAnimal;
        myDog.run(); //now it's normal dog, but it's still the same reference

        //both addresses are similar!!! One object, many references!
        System.out.println(myDog); //shows address of myDog
        System.out.println(someAnimal); //shows address of someAnimal
    }
}
