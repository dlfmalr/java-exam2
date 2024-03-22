package base;

import domain.Article;
import domain.ArticleController;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    ArticleController articleController = new ArticleController();
    Scanner scan = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("명령어 : ");
            String cmd = scan.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (cmd) {
                case "add" -> articleController.add();
                case "list" -> articleController.list();
                case "delete" -> articleController.delete();
                case "update" -> articleController.update();
                case "detail" -> articleController.detail();
                case "search" -> articleController.search();
                default -> System.out.println("올바른 명령어가 아닙니다.");
            }
        }
    }
}
