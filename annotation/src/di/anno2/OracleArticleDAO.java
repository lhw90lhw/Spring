package di.anno2;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Oracle insert: "+article.getName()+" / "
										    +article.getTitle()+" / "
										    +article.getDate()+" / "
										    +article.getContent());

	}

}
