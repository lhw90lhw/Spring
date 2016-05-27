package di.anno2;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Mysql insert: "+article.getName()+" / "
										   +article.getTitle()+" / "
										   +article.getDate()+" / "
										   +article.getContent());
		
	}

}
