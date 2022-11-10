package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        // Given
        Dog dog1 = AnimalFactory.createDog("Doug", new Date(2022, 9, 22));
        String expectedName = "Doug";
        Date expectedDate = new Date(2022, 9, 22);
        // When
        String actualName = dog1.getName();
        Date actualDate = dog1.getBirthDate();
        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        // Given
        Cat cat1 = AnimalFactory.createCat("Kitty", new Date(2022, 9, 22));
        String expectedName = "Kitty";
        Date expectedDate = new Date(2022, 9, 22);
        // When
        String actualName = cat1.getName();
        Date actualDate = cat1.getBirthDate();
        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

}
