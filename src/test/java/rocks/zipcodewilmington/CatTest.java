package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        String actual = cat.getName();
        //Then
        Assert.assertEquals(expectedCatName, actual);
    }

    @Test
    public void testSetBirthDate() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expectedBirthDate, actual);
    }

    @Test
    public void testSpeak() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        String expectedSpeak = "meow!";
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void testEat() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        Integer expectedMeals = 1;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        Food food = new Food();
        cat.eat(food);
        Integer actual = cat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMeals, actual);
    }

    @Test
    public void testGetId() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        Integer actual = cat.getId();
        //Then
        Assert.assertEquals(expectedId, actual);
    }

    @Test
    public void testInstanceOfAnimal() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        boolean expected = true;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        boolean actual = cat instanceof Animal;
        //Then
        Assert.assertEquals(expected, actual);
    }


    //class cannot be instanceof an interface bc interface is abstract? wait not true bc mammal is class
    @Test
    public void testInstanceOfMammal() {
        //Given
        String expectedCatName = "Jane";
        Date expectedBirthDate = new Date(2020, 12,25);
        Integer expectedId = 101;
        boolean expected = true;
        //When
        Cat cat = new Cat(expectedCatName, expectedBirthDate, expectedId);
        boolean actual = cat instanceof Mammal;
        //Then
        Assert.assertEquals(expected, actual);
    }
}
