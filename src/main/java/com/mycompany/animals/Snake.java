package com.mycompany.animals;

import com.mycompany.interfaces.Audible;
import com.mycompany.interfaces.Moveable;

/**
 * Created by korne on 10.05.2017.
 */
public class Snake implements Moveable, Audible{

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " : I'm moving!");
        //gets name of class and adds " : I'm moving"
    }

    @Override
    public void hide() {
        System.out.println(this.getClass().getSimpleName() + " : I'm hiding!");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getClass().getSimpleName() + " : I'm making noise!");
    }
}
