package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthdateTest () {
        // Given
        Dog dog = new Dog(null, null, null);
        Date expected = new Date(2022, 11, 9);
        // When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest () {
        // Given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        // When
        String actual = dog.speak();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest () {
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        Integer expected = 2;
        // When
        dog.eat(food);
        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest () {
        // Given
        Dog dog = new Dog(null, null, 203);
        Integer expected = 203;
        // When
        Integer actual = dog.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfAnimalTest () {
        // Given
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        // When
        boolean actual = dog instanceof Animal;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfMammalTest () {
        // Given
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        // When
        boolean actual = dog instanceof Mammal;
        // Then
        Assert.assertEquals(expected, actual);
    }

}
