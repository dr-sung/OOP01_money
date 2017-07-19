public class Money {

    private int dollars;
    private int cents;

    Money(int dollars, int cents) {
       this.dollars = dollars;
       this.cents = cents;
       normalize();
    }

    // non-negative, 0 <= cents <= 99
    private void normalize() {
        int total = dollars * 100 + cents;
        if (total < 0) {
            dollars = cents = 0;
        } else {
            dollars = total / 100;
            cents = total % 100;
        }

    }

    Money add(Money m) {
        return new Money(dollars + m.dollars, cents + m.cents);
    }

    @Override
    public String toString() {
        return dollars + " dollars " + cents + " cents";
    }

    Money diff(Money m) {
        int t1 = dollars * 100 + cents;
        int t2 = m.dollars * 100 + m.cents;
        int d = t1 - t2;
        if (d < 0) d = -d;
        return new Money(0, d);
    }
    
}
