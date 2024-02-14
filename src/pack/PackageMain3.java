package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User(); // 자주 사용하는 클래스는 import를 사용한다.
        pack.b.User userB = new pack.b.User(); // 클래스 이름이 중복되면 import 사용 불가
    }
}
