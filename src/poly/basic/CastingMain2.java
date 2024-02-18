package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // poly.childMethod(); // 호출 불가능

        Child child = (Child) poly;
        child.childMethod();

        ((Child) poly).childMethod(); // 일시적 다운 캐스팅
    }
}
