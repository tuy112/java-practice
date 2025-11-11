package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 밑줄(_), 문자(abc), 숫자(123) 사용가능 (공백 x)
        // 밑줄, 문자로 시작 가능
        // 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 예약어 사용 불가 (public, static, void, int, double, float ...)

        // 입국 신고서
        String nationality = "대한민국";
        String firstName = "Jay";
        String lastName = "Kim";
        String dateOfBirth = "1996-01-10";
        String residentialAddress = "Some Hotel";
        String purposeOfVisit = "관광";
        int accompany = 3; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간
        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용되는 경우 (이름이 중요치 않을 때)
        int i = 0;
        String str = "";

        // 변하지 않는 상수는 대문자로..
        final String CODE = "KR";
    }
}
