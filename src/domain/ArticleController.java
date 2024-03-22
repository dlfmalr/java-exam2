package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleController {
    ArticleRepository articleRepository = new ArticleRepository();
    ArticleView articleView = new ArticleView();
    Article article = new Article();

    Scanner scan = new Scanner(System.in);
    int WRONG_VALUE = -1;
    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scan.nextLine();

        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = scan.nextLine();

        articleRepository.saveArticle(title, body);
        System.out.println("게시물이 등록되었습니다.");
    }
    public void list() {
        System.out.println("=============");
        ArrayList<Article> targetlist = new ArrayList<>();
        for (int i = 0; i < targetlist.size(); i++) {
            Article article = targetlist.get(i);
            System.out.println("번호 : " + article.getId());
            System.out.printf("제목 : %s\n", article.getTitle());
            System.out.println("================");
        }

    }
    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int id = scan.nextInt();
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int id = scan.nextInt();

    }
    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int id = scan.nextInt();
        Article article = new Article();
        articleView.printArticleDetail(article);
    }
    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = scan.nextLine();
    }
}
