import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    Visitor visitor;
    RollerCoaster attraction1;
    RollerCoaster attraction2;

    @Before
    public void before() {
        themepark = new ThemePark();
        visitor = new Visitor(14, 1.2, 40.0);
        attraction1 = new RollerCoaster("Big Dipper",15);
        attraction2 = new RollerCoaster("Catterpillar",10);
    }

    @Test
    public void hasAnEmptyAttractionsList() {
        assertEquals(0, themepark.getAllReviewed().size());
    }

    @Test
    public void canCreateVisit() {
        themepark.visit(visitor,attraction1);
        assertEquals("Big Dipper", visitor.getVisitedAttractions().get(0).getName());
        assertEquals(1, attraction1.getVisitCount());
    }

    @Test
    public void getAllReviews() {
        themepark.addAttraction(attraction1);
        themepark.addAttraction(attraction2);
        themepark.visit(visitor,attraction1);
        themepark.visit(visitor,attraction2);
        assertEquals(2, themepark.allReviews().size());
//        assertEquals(15, themepark.allReviews().get(0).);
//        assertEquals("Catterpillar", themepark.allReviews().get(1).getName());
//        assertEquals(10, themepark.allReviews().get(1).getRating());
    }



}
