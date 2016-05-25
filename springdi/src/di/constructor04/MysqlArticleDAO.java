package di.constructor04;

public class MysqlArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Mysql insert: "+article.getName()+" / "
										   +article.getTitle()+" / "
										   +article.getDate()+" / "
										   +article.getContent());
		
	}

}
