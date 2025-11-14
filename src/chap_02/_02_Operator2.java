package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num);

        num = num - 2;
        System.out.println(num);

        num = num * 2;
        System.out.println(num);

        num = num / 2;
        System.out.println(num);

        System.out.println("=========================================");

        // 복합 대입 연산자 (반복을 최소화)
        num = 10;
        // num = num + 2 // 같은 변수일 경우에만..
        num += 2;
        System.out.println(num);
    }
}
