package main.java.com.javaeagles.section01;

import main.java.com.javaeagles.section01.controller.Pcontorller;
import main.java.com.javaeagles.section01.dto.PhoneDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Pcontorller pcontorller = new Pcontorller();
        boolean phone1 = true;
        String result = "";

        while (phone1){ // 메인 메뉴

            System.out.println("=====전화번호부(그림)=====");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 상세조회");
            System.out.print("동작하실 번호를 입력하세요.");

            int input = sc.nextInt();
            sc.nextLine();

            switch (input){ // 메인메뉴 동작
                case 1 : // 이름, 번호, 메일, 메모, 그룹 입력

                    System.out.println("등록을 시작합니다.");
                    int mo = sc.nextInt();
                    sc.nextLine();

                    PhoneDTO[] phones = new PhoneDTO[mo];
                    for(int i = 0; i < phones.length; i++){

                        System.out.println("이름을 입력하세요.");
                        String name = sc.nextLine();
                        System.out.println("번호를 입력하세요.");
                        String phone = sc.nextLine();
                        System.out.println("메일을 입력하세요.");
                        String email = sc.nextLine();
                        System.out.println("메모을 입력하세요.");
                        String memo = sc.nextLine();
                        System.out.println("그룹을 입력하세요.");
                        String group = sc.nextLine();

                        phones[i] = new PhoneDTO(name, phone, email, memo, group);
                    }

                    result = pcontorller.info(phones);
                    break;

                case 2 :
                    // 수정
                    // 수정하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는 확인
                    // 존재하면 true 수정할 항목선택 존재하지않으면 false
                    // 컨트롤러 넘겨
                    // 수정

//                    System.out.println();
//                    System.out.print("수정할 고객의 이름을 입력하세요.");
//                    name = sc.next();
//                    for (int i = 0; i < customers.size(); i++) {
//                        if (name.equals(customers.get(i).getName())) {
//
//                            System.out.print("수정하실 항목을 선택하세요. (1)이름     (2)주소     (3)번호");
//                            n = sc.nextInt();
//                            System.out.println();
//
//                            switch (n) {
//                                case 1:
//                                    System.out.print("이름을 새로 입력하세요.");
//                                    name = sc.next();
//                                    customers.get(i).setName(name);
//                                    break;
//                                case 2:
//                                    System.out.print("주소를 새로 입력하세요.");
//                                    address = sc.next();
//                                    customers.get(i).setAddress(address);
//                                    break;
//                                case 3:
//                                    System.out.print("번호를 새로 입력하세요.");
//                                    phone = sc.next();
//                                    customers.get(i).setPhone(phone);
//                                    break;
//                            }
//                            System.out.println("수정되었습니다!");
//
//                        } else
//                            System.out.println("잘못된 정보입니다.");
//                    }
//
//                    break;


                case 3 :
                    // 삭제
                    // 삭제하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는지 확인
                    // 존재하면 true 전체삭제 존재하지 않으면 false
                    // 컨트롤 넘겨

//                    System.out.println();
//                    System.out.println("삭제할 고객의 이름을 입력하세요.");
//                    System.out.println("---------------------");
//                    System.out.print("이름: ");
//                    name = sc.next();
//                    for (int i = 0; i < customers.size(); i++) {
//                        if (name.equals(customers.get(i).getName())) {
//                            customers.remove(i);
//                            System.out.println("삭제되었습니다!");
//                        } else
//                            System.out.println("회원이 존재하지 않습니다.");
//                    }
//                    break;

                    System.out.println("삭제하실 분의 이름을 입력해 주세요.");
                    int nik = sc.nextInt();

                    result = nik + " 님";
                    result += pcontorller.phoneDelete(nik);
                    break;

                case 4 :
                    // 전체조회
                    // 등록된 번호 모두 조회
                    // 넘겨
                    result = pcontorller.phoneAllInfo();
                    break;

                case 5 :
                    // 상세조회
                    // 이름을 입력 받아 존재하는지 확인
                    // 있으면 모든 정보 조회 없으면 false
                    // 넘겨
                    System.out.println(pcontorller.phoneAllInfo());
                    System.out.println("상세 조회하실 분의 번호를 입력해주세요. : ");

                    int serch = sc.nextInt();
                    sc.nextLine();
                    result = pcontorller.phoneDetail(serch);
                    break;

                default:
                    System.out.println("잘못 입력 됐습니다.");
                    break;
            }

            System.out.println(result);
            System.out.println("종료하시겠습니까?");
            phone1 = sc.nextBoolean();

        }

    }
}
