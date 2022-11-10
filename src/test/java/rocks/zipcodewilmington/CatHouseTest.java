package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        CatHouse.clear();
        Cat kitty = new Cat(null,null, null);
        CatHouse.add(kitty);
        Integer expected = new CatHouse().getNumberOfCats();
        //When
        Integer actual = 1;
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        //Given
        CatHouse.clear();
        Cat kitty = new Cat(null,null, 234);
        CatHouse.add(kitty);
        CatHouse.remove(234);
        Integer expected = new CatHouse().getNumberOfCats();
        //When
        Integer actual = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //Given
        CatHouse.clear();
        Cat kitty = new Cat(null,null, 234);
        CatHouse.add(kitty);
        CatHouse.remove(kitty);
        Integer expected = new CatHouse().getNumberOfCats();
        //When
        Integer actual = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //Given
        CatHouse.clear();
        Cat kitty = new Cat(null,null, 234);
        CatHouse.add(kitty);
        CatHouse.getCatById(234);
        Cat expected = kitty;
        //When
        Cat actual = CatHouse.getCatById(234);
        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumOfCatsTest() {
        //Given
        CatHouse.clear();
        Cat kitty = new Cat(null,null, null);
        CatHouse.add(kitty);
        Integer expected = new CatHouse().getNumberOfCats();
        //When
        Integer actual = 1;
        //Then
        Assert.assertEquals(expected, actual);
    }

}
