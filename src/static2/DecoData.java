package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수에 접근 불가
//        instanceMethod(); // 인스턴스 메서드에 접근 불가

        staticValue++;
        staticMethod();
    }
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
