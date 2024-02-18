package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    } // ctrl + o -> 자동 오버라이딩
}
