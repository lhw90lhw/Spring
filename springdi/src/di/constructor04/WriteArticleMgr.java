package di.constructor04;

public class WriteArticleMgr implements IWriteArticleMgr {
	private IArticleDAO articleDAO;	
	
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
