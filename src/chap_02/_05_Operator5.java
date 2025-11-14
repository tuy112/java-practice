package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = 조건 ? 참인 경우 결과 값 : 거짓인 경우 결과 값
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        int min = (x < y) ? x : y;
        System.out.println(max);
        System.out.println(min);

        System.out.println("=====================================");

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String result = (x != y) ? "같아요" : "달라요";
        System.out.println(result);
    }
}
