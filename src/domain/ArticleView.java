package domain;

import java.util.ArrayList;

public class ArticleView {
//    public void ptintArticleList(ArrayList<Article> targetlist) {
//        ArrayList<Article> articlelist = new ArrayList<>();
//        System.out.println("===============");
//        for (int i = 0; i < targetlist.size(); i++) {
//            Article article = targetlist.get(i);
//            System.out.println("번호 : " + article.getId());
//            System.out.printf("제목 : %s\n", article.getTitle());
//            System.out.println("================");
//        }
//    }
    public void printArticleDetail(Article article) {
        System.out.println("================");
        System.out.println("번호 : " + article.getId());
        System.out.println("제목 : " + article.getId());
        System.out.println("내용 : " + article.getId());
        System.out.println("================");
    }
}
