package com.javaeagles;

import javax.sound.sampled.LineEvent;
import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args) {
        Scanner sc = PhoneUI.sc;
        PhoneUI ui = new PhoneUI();

        int menu=0;
        while(true) {
            try {
                ui.menu();
                menu = sc.nextInt();
                sc.nextLine();
                if(menu>Menu.CLOSE || menu<Menu.INSERT) {
                    throw new MenuChoiceException(menu);
                }
                switch (menu) {
                    case Menu.INSERT:
                        ui.insert();
                        break;
                    case Menu.SEARCH:
                        ui.search();
                        break;
                    case Menu.REMOVE:
                        ui.remove();
                        break;
                    case Menu.ALLPRINT:
                        ui.allprint();
                        break;
                    case Menu.CLOSE:
                        ui.close();
                        return;
                }
            } catch (MenuChoiceException e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
            }
        }
    }
}