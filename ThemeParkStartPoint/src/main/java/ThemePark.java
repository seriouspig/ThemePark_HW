import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> attractions;

    public ThemePark() {
        this.attractions = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.attractions;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addOneToVisitCount();
        visitor.addAttractionToVisitedList(attraction);

    }

    public HashMap<String, Integer> allReviews() {
        HashMap<String, Integer> allReviews = new HashMap<>();
        for (IReviewed attraction : this.attractions) {
            allReviews.put(attraction.getName(), attraction.getRating());
        }
        return allReviews;
    }
}

