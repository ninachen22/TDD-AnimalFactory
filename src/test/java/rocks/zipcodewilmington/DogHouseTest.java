package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //G
        Dog dog1 = AnimalFactory.createDog(null, null);
        Integer expected = 1;
        DogHouse.add(dog1);
        //W
        Integer actual = DogHouse.getNumberOfDogs();
        //T
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        //Given
        DogHouse.clear();
        Dog dog1 = new Dog(null,null, 123);
        DogHouse.add(dog1);
        DogHouse.remove(123);
        Integer expected = new DogHouse().getNumberOfDogs();
        //When
        Integer actual = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        //Given
        DogHouse.clear();
        Dog dog1 = new Dog(null,null, 123);
        DogHouse.add(dog1);
        DogHouse.remove(dog1);
        Integer expected = new DogHouse().getNumberOfDogs();
        //When
        Integer actual = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        //Given
        DogHouse.clear();
        Dog dog1 = new Dog(null,null, 123);
        DogHouse.add(dog1);
        DogHouse.getDogById(123);
        Dog expected = dog1;
        //When
        Dog actual = DogHouse.getDogById(123);
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        Integer expected = 1;
        // When
        DogHouse.add(animal);
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        DogHouse.getNumberOfDogs();
    }
}
