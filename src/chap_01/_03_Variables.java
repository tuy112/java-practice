package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "Jay";

        System.out.println(name + "님, 배송이 시작됩니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        System.out.println("====================================");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        System.out.println("====================================");

        boolean pass = true;
        String result = pass ? "합격" : "불합격";
        System.out.println("이번 시험에 합격했을까요?" + result);

        System.out.println("====================================");

        double d = 3.14123456789; // 정밀한 계산을 원할 시 double 사용!
        // float f = 3.14;
        float f = 3.14123456789F; // 정밀한 계산이 필요없을 경우 float..
        System.out.println(d);
        System.out.println(f);

        // int i = 1000000000000;
        long l = 1000000000000L;
        System.out.println(l);

        // int, long, float, double, char, String, boolean
    }
}
