package domain;

import java.util.ArrayList;

public class ArticleRepository {


    int latestArticleId = 1;

//    public ArrayList<Article>

    public Article saveArticle(String title, String body) {
        Article articlelist = new Article(latestArticleId, title, body);


        return articlelist;
    }
//    public ArrayList<Article> articleBylist() {
//        ArrayList<Article> articlelist = new ArrayList<>();
//        ArticleView articleView = new ArticleView();
//        articleView.ptintArticleList(articlelist);
//
//        return articlelist;
//    }
}
