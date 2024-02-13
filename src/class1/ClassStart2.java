package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrade = {80, 90, 100};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("학생:"+ studentNames[i] + " 이름: " + studentAges[i] + " 성적: "+ studentGrade[i]);
        }

    }
}
