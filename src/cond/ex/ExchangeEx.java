package cond.ex;

public class ExchangeEx {
    public static void main(String[] args) {

        int dollar = 10;

        if (dollar< 0) {
            System.out.println("잘못된 금액입니다");
        }   else if(dollar == 0) {
            System.out.println("환전할 금액이 없습니다");
        }   else{
            int change = dollar * 1300;
            System.out.println("환전 금액은 " + change +"입니다.");
        }
    }



}
