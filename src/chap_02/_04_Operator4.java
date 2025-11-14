package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean kimchi = true;
        boolean egg = false;
        boolean meat = true;

        System.out.println(kimchi || egg || meat); // or 연산자 (하나라도 true면 true)
        System.out.println(kimchi && egg && meat); // and 연산자 (모두 true여야 true, 하나라도 틀리면 false

        System.out.println("=========================================");

        // AND 연산
        System.out.println((5 > 3) && (3 > 1)); // t
        System.out.println((5 > 3) && (3 < 1)); // f

        // System.out.println(1 < 3 < 5); // 불가능한 코드

        System.out.println("=========================================");

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5)); // true의 반대인 false
    }
}
