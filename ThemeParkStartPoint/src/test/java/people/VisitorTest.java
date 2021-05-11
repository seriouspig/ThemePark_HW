package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster attraction1;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        attraction1 = new RollerCoaster("Big Dipper",15);
        visitor.addAttractionToVisitedList(attraction1);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void attractionAddedToVisitedList(){
        assertEquals(1,visitor.getVisitedAttractions().size());
    }
}
