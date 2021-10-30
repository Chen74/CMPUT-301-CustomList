import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(new City("Halifax", "NS"));
        assertFalse(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(list.getCount(), listSize + 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
    }

    @Test
    public void countCityTest() {
        int listSize = list.getCount();
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(list.countCity(), listSize + 1);
        list.deleteCity(city);
        assertEquals(list.countCity(), listSize);
    }


}
