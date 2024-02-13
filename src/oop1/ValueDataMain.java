package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    static void add(ValueData valueData) { // 데이터와 데이터 처리 부분이 분리
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
