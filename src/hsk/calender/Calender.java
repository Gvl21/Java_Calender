package hsk.calender;

import java.util.Scanner;

public class Calender {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void maxDaysOfMonth(int month) {
        System.out.printf("%d월의 마지막 날은 %d입니다.\n", month, MAX_DAYS[month - 1]);
    }

    public void sampleCal() {
        System.out.println(" 일 월 화 수 목 금 토 ");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println(" 8  9 10 11 12 13 14 ");
        System.out.println("15 16 17 18 19 20 21 ");
        System.out.println("22 23 24 25 26 27 28 ");
    }


    public static void main(String[] args) {
        Calender cal = new Calender();
        Scanner scn = new Scanner(System.in);


        boolean isRun = true;
        while (isRun) {
            cal.sampleCal();
            System.out.print("월을 입력하세요>");
            int month = scn.nextInt();
            
            if (month == -1) {
                isRun = false;
            }else if(month>=1 && month<=12){
                cal.maxDaysOfMonth(month);
            }else {
                System.out.println("1-12 사이의 숫자만 넣어줘요");
            }
        }


    }
}
