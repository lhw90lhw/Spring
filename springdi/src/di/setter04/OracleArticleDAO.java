package di.setter04;

public class OracleArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Oracle insert: "+article.getName()+" / "
										    +article.getTitle()+" / "
										    +article.getDate()+" / "
										    +article.getContent());

	}

}
