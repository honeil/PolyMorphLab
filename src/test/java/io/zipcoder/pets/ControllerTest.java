package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by latashawatson on 1/30/17.
 */
public class ControllerTest {

    @Test
    public void askUserForNumberOfPetsTest() {
        UserInput expected = new UserInput();
        expected.setNumberOfPets(5);
        Controller controller = new Controller();
        UserInput actual = controller.getUserInput();
        Assert.assertEquals("Testing actual to be equal to five", expected.getNumberOfPets(), actual.getNumberOfPets());

    }

    @Test
    public void askUserForPetInfo(){
        UserInput expected = new UserInput();
        ArrayList<Pet> expectedPets = new ArrayList<Pet>();
        expectedPets.add(new Pet("fluffy", "cat"));
        Controller controller = new Controller();
        UserInput actual = controller.getUserInput();
        Assert.assertEquals("Values should be equal",expected.getPets().toString(), actual.getPets().toString());
    }
}
