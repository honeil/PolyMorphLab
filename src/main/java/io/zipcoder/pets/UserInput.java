package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by latashawatson on 1/30/17.
 */
public class UserInput {
    private int numberOfPets;
    private ArrayList<Pet> pets;

    public UserInput(){

    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }


}
