package static2.exercise;

public class Car {
    private String name;
    private static int TotalCars;

    public Car(String carName) {
        System.out.println("차량 구입, 이름: "  + name);
        this.name = carName;
        TotalCars++;
    }
    
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + TotalCars);
    }
}
