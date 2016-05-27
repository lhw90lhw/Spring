package di.anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("mysql")
	private IArticleDAO articleDAO;	
	
	
	public WriteArticleMgr() {
		super();
	}

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}
	
	public void WriteArticleMgr(IArticleDAO articleDAO){
		System.out.println("WriteArticleMgr");
	}
	
}
