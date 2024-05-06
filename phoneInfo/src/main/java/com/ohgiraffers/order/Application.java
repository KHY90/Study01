package com.ohgiraffers.order;

import com.ohgiraffers.fakeDB.PhoneDB;
import com.ohgiraffers.order.controller.Pcontroller;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.Scanner;


public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pcontroller pcontroller = new Pcontroller();
        boolean order = true;
        int info = 1;
        String result = "";

        while(info == 1){
            System.out.println("====== 전화번호부(그림) ======");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 상세조회");
            System.out.print("무엇을 도와드릴까요? : ");
            int input = sc.nextInt();
            sc.nextLine();

            switch(input){
                case 1 :
                    System.out.println("등록할 인원수를 적어주세요 : ");
                    int cnt = sc.nextInt();
                    sc.nextLine();
                    PhoneDTO[] phones = new PhoneDTO[cnt];
                    for(int i = 0; i < phones.length; i++){
                    System.out.println("이름을 등록해 주세요 : ");
                    String name = sc.nextLine();
                    System.out.println("전화번호를 등록해 주세요 : ");
                    String phone = sc.nextLine();
                    System.out.println("이메일을 등록해 주세요 : ");
                    String email = sc.nextLine();
                    System.out.println("그룹을 등록해 주세요 : ");
                    String group = sc.nextLine();
                    System.out.println("메모를 작성해 주세요 : ");
                    String memo = sc.nextLine();
                    phones[i] = new PhoneDTO(name, phone, email, group, memo);
                }
                    result = pcontroller.pInfo(phones);
                    break;

                case 2 :
                    System.out.println("수정할 전화번호의 등록 번호를 입력하세요 : ");
                    int modifyNo = Integer.parseInt(sc.nextLine());

                    System.out.println("수정할 내용을 입력하세요 : ");
                    System.out.println("수정할 이름 등록 : ");
                    String newName = sc.nextLine();
                    System.out.println("수정할 전화번호 등록 : ");
                    String newPhone = sc.nextLine();
                    System.out.println("수정할 이메일 등록 : ");
                    String newEmail = sc.nextLine();
                    System.out.println("수정할 그룹을 등록 : ");
                    String newGroup = sc.nextLine();
                    System.out.println("수정할 메모를 등록 : ");
                    String newMemo = sc.nextLine();

                    PhoneDTO phoneDTO = new PhoneDTO(newName, newPhone, newEmail, newGroup, newMemo);
                    result = pcontroller.infoModify(modifyNo, phoneDTO);
                    System.out.println(result);
                    break;

                case 3 :

                    System.out.print("등록순번 중 삭제할 순번을 입력해 주세요 : ");
                    int no = Integer.parseInt(sc.nextLine());
                    result = no + "번";
                    result += pcontroller.infoDelete(no);
                    break;

                case 4 :
                    result = pcontroller.infoRead();
                    break;

                case 5 :
                    System.out.println(pcontroller.infoRead());
                    System.out.print("상세 조회할 등록 번호를 입력해주세요 : ");
                    int num = Integer.parseInt(sc.nextLine());
                    result += pcontroller.infoDetail(num);
                    break;

                default :
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);
            System.out.println("등록을 종료하시겠나요?(계속 1, 종료 아무키)");
            info = sc.nextInt();

        }


    }


}
