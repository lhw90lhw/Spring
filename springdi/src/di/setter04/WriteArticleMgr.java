package di.setter04;

public class WriteArticleMgr implements IWriteArticleMgr {
	private IArticleDAO articleDAO;			
	
	public WriteArticleMgr() {
		System.out.println("WriteArticleMgr�� �������� ȣ�� �Ϸ�");
	}
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}
	
	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}

	public void setArticleDAO(IArticleDAO articleDAO) {
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
