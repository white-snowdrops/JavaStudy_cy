package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        intValue = (int) doubleValue; //형 변환
        System.out.println(intValue);

        System.out.println((int) 10.5);
    }
}
