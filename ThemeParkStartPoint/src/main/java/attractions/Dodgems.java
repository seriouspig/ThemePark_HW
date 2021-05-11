package attractions;

import apple.laf.JRSUIConstants;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceVor(Visitor visitor) {
        if (visitor.getAge() < 12) {
        return defaultPrice()/2;
            }
        else return defaultPrice();
    }
}
