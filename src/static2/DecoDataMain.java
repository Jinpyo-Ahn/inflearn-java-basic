package static2;

//import static static2.DecoData.*;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("1. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

//        DecoData data3 = new DecoData();
//        data3.staticCall(); // 가능은 하지만 추천하지 않는다. -> 코드에 혼동이 온다.(인스턴스에 접근하는 의미가 없음)

        staticCall();
    }
}
