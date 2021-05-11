package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(32, 205, 20);
        visitor2 = new Visitor(7, 110, 5);
        visitor3 = new Visitor(14, 144, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canCheckVisitorIsSuitable() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void isChargedDoubleOrNot(){
        assertEquals(16.80,rollerCoaster.priceVor(visitor1),0.01);
        assertEquals(8.40,rollerCoaster.priceVor(visitor2),0.01);
    }

}
