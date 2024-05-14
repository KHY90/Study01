package com.javaeagles;
import java.awt.*;
import java.util.Scanner;

public class PhoneUI implements Menu {
    public static Scanner sc = new Scanner(System.in);
    private PhoneBook pb;

    private String name, phone, major, company;
    private int year, menu;
    private boolean result;

    public PhoneUI() {
        pb = PhoneBook.getPhoneBook(100);
    }
    public void menu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 : ");
    }
    public void insert() {
        try {
            System.out.println("데이터 입력을 시작합니다.");
            System.out.println("1. 일반	2. 대학	3. 회사");
            System.out.print("선택 >> ");
            menu = sc.nextInt();
            sc.nextLine();

            if(menu>COMPANY || menu<NORMAL) {
                throw new MenuChoiceException(menu);
            }
            switch (menu) {
                case NORMAL:
                    System.out.print("이름 : ");
                    name = sc.nextLine();
                    System.out.print("전화번호 : ");
                    phone = sc.nextLine();

                    result = pb.insert(name, phone);
                    if(result) System.out.println("데이터 입력이 완료되었습니다.");
                    else System.out.println("더 이상 데이터를 입력할 수 없습니다.");
                    break;
                case UNIV:
                    System.out.print("이름 : ");
                    name = sc.nextLine();
                    System.out.print("전화번호 : ");
                    phone = sc.nextLine();
                    System.out.print("전공 : ");
                    major = sc.nextLine();
                    System.out.print("학년 : ");
                    year = sc.nextInt();

                    result = pb.insert(name, phone, major, year);
                    if(result) System.out.println("데이터 입력이 완료되었습니다.");
                    else System.out.println("더 이상 데이터를 입력할 수 없습니다.");
                    break;
                case COMPANY:
                    System.out.print("이름 : ");
                    name = sc.nextLine();
                    System.out.print("전화번호 : ");
                    phone = sc.nextLine();
                    System.out.print("회사 : ");
                    company = sc.nextLine();

                    result = pb.insert(name, phone, company);
                    if(result) System.out.println("데이터 입력이 완료되었습니다.");
                    else System.out.println("더 이상 데이터를 입력할 수 없습니다.");
                    break;
            }
        } catch (MenuChoiceException e) {
            System.out.println(e.getMessage());
            System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
        }
    }

    public void search() {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();

        result = pb.search(name);
        if(result) System.out.println("데이터 검색이 완료되었습니다.");
        else System.out.println("검색할 데이터가 존재하지 않습니다.");
    }
    public void remove() {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("전화번호 : ");
        phone = sc.nextLine();

        int idx = pb.searchPhone(phone);
        if(idx != -1) {
            System.out.println("삭제할 데이터가 존재합니다. 정말 삭제하시겠습니까?");
            System.out.println("1. Yes	2. No");
            System.out.print("선택 : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    pb.remove(idx);
                    System.out.println("데이터 삭제가 완료되었습니다.");
                    break;
                case 2:
                    System.out.println("삭제를 취소합니다.");
                    break;
                default:
                    break;
            }
        }
    }
    public void allprint() {
        System.out.println("데이터 출력을 시작합니다.");
        result = pb.allprint();
        if(result) {
            System.out.println("데이터 출력이 완료되었습니다");
        }else {
            System.out.println("출력할 데이터가 없습니다.");
        }
    }

    public void close() {
        System.out.println("프로그램을 종료합니다");
        sc.close();
    }
}