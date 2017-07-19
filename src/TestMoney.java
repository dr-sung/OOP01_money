
public class TestMoney {

    public static void main(String[] args) {

        Money m1 = new Money(5, 20);
        Money m2 = new Money(6, 95);
        Money m3 = m1.add(m2);
        System.out.println("sum is " + m3);
        Money m4 = m1.diff(m2);
        System.out.println("diff is " + m4);

    }
    
}
