package h3;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        
        int arith = 15;

        a = 10;
        b = 20;

        c = a + 10;
        d = b + 100;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("arith: " + arith);

        if (arith > 1) {
            System.out.println("In if c: " + c);
        }

        if (arith < 1) {
            System.out.println("In if d: " + d);
        }

        if (arith == 1) {
            System.out.println("In if d-c: " + (d - c));
        }
        
    }
}
