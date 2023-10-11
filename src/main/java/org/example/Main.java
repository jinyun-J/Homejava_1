package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==명언 앱==");
        int count = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();
        while (true) {
            System.out.println("명령) :");
            String input = sc.nextLine().trim();
            if (input.equals("종료")) {
                break;
            } else if (input.equals("등록")) {
                int id = count + 1;
                System.out.println("명언 : ");
                String content = sc.nextLine().trim();
                System.out.println("작가 : ");
                String author = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(id, content, author);
                wiseSayings.add(wiseSaying);

                System.out.printf("%d번 명언이 등록되었습니다.\n",id);
                count = id;
            }
            else if (input.equals("목록")){
                System.out.printf("생성된 명언 수 : %d\n", wiseSayings.size());
            }
        }
    }
}