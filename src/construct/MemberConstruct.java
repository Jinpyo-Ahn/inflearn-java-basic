package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 밑의 생성자를 호출한다. (자신의 생성자를 호출) 첫 줄에서만 사용 가능
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age =  " + age + ",grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
