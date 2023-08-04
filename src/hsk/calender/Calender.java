package hsk.calender;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        System.out.println(" 일 월 화 수 목 금 토 ");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println(" 8  9 10 11 12 13 14 ");
        System.out.println("15 16 17 18 19 20 21 ");
        System.out.println("22 23 24 25 26 27 28 ");

        Scanner scn = new Scanner(System.in);
        System.out.println("월을 입력하세요>");
        int month = scn.nextInt();

        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.printf("%d월의 마지막 날은 %d입니다.", month, maxDays[month-1]);


    }
}
