package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

//        poly.childMethod(); // 자식의 인스턴스(메서드)를 참조할 수 없다.
    }
}