package Time;

public class TimeTest {
    
    public static void main(String[] args) {
        
        Time t1 = new Time(12, 10, 15);
        Time t2 = new Time(10, 20, 26);
        
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.nextSecond());
        System.out.println(t2.previousSecond());

    }
}
