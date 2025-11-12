package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형 -> 실수형
        // 실수형 -> 정수형
        int score = 93; // 정수형
        System.out.println(score);
        System.out.println((float) score); // 실수형으로 변환
        System.out.println((double) score); // 실수형으로 변환

        System.out.println("======================================");

        float score_f = 93.3F; // 실수형
        double score_d = 98.8;
        System.out.println((int) score_f); // 정수형으로 변환
        System.out.println((int) score_d); // 정수형으로 변환

        System.out.println("======================================");

        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score);

        score_d = (double) 93 + 98.8;
        System.out.println(score_d);

        // int -> long -> float -> double (작은 범위에서 큰 범위로는 자동 형변환이 된다)
        double convertedScoreDouble = score;

        System.out.println("======================================");

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
