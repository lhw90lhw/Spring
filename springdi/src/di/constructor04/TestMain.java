package di.constructor04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		ArticleDTO article = new ArticleDTO("이현우",
				"조영남 :대작 의혹관련 소속사 대표 소환","에휴..노답 아저씨","2016/05/24");
		ApplicationContext container = 
				new	ClassPathXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr writeArticle = (IWriteArticleMgr)container.getBean("WriteArticle");
		writeArticle.write(article);
	}

}
