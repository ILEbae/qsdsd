package lms.main;

import java.util.Scanner;

public class MainMenu {
    int sel;

        Scanner sc = new Scanner(System.in);
        public int Issue(){
            System.out.println("<<메인 메뉴>>");
            System.out.println("1. 학생멤버 추가");
            System.out.println("2. 학생멤버 목록 출력");
            System.out.println();
            System.out.println("3.연구원 멤버 추가");
            System.out.println("4.연구원 멤버 목록 출력");
            System.out.println();
            System.out.println("5.멤버 조회");
            System.out.println("6.전체 멤버 목록 출력");
            System.out.println();
            System.out.println("7.Lab 추가");
            System.out.println("8.Lab 목록 출력");
            System.out.println("9.Lab별 멤버 목록 출력");
            System.out.println();
            System.out.println("0.종료");
            System.out.println("--------------------------");
            System.out.print("메뉴번호?>>");    sel = sc.nextInt();
            return sel;
        }
    }

