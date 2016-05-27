package di.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		ArticleDTO article = new ArticleDTO("������",
				"������ :���� ��Ȥ���� �Ҽӻ� ��ǥ ��ȯ","����..��� ������","2016/05/24");
		ApplicationContext container = 
				new	ClassPathXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr mgr = (IWriteArticleMgr)container.getBean("mgr");
		mgr.write(article);
	}

}
