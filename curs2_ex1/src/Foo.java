public class Foo {

    void trasferPrinValoare(int x){
        x = 10;
        System.out.println("x= " + x);
    }

    void trasferPrinReferinta(Point p){
        p.x = 10;
        System.out.println("x = "+ p.x);

    }
}
