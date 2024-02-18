package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent poly = new Child();
        // poly.childMethod(); // 호출 불가능

        Child child = (Child) poly;
        child.childMethod();
    }
}
