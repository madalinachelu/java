public class Main{
    public static void main(String [] args){
        Foo f1 = new Foo();

        int x = 40;

        Point p1 = new Point();
        p1.x = 40;

        f1.trasferPrinValoare(x);

        System.out.println("exemplu1 x = " + x);

        f1.trasferPrinReferinta(p1);
        System.out.println("exemplu1 p1.x = "+ p1.x);
    }
}