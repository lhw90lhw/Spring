package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		ArticleDTO article = new ArticleDTO("이현우",
				"조영남 :대작 의혹관련 소속사 대표 소환","에휴..노답 아저씨","2016/05/24");
		ApplicationContext container = 
				new	ClassPathXmlApplicationContext("config/setter.xml");
		ApplicationContext container2 = 
				new	ClassPathXmlApplicationContext("config/setter.xml");
		IWriteArticleMgr writeArticle = (IWriteArticleMgr)container.getBean("WriteArticle");
		writeArticle.write(article);
		IWriteArticleMgr writeArticle2 = (IWriteArticleMgr)container.getBean("WriteArticle");
		//기본상태에서 싱글톤인지 확인 - 기본으로 빈을 생성하지 않고 scope속성을 prototype으로 변경하면
		//					   getBean이 호출될 때 마다 빈이 생성된다.
		//					   (기본은 ApplicationContext객체가 생성될 때 한 번만 생성된다.)
		if(writeArticle==writeArticle2){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}

}
