package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		ArticleDTO article = new ArticleDTO("������",
				"������ :���� ��Ȥ���� �Ҽӻ� ��ǥ ��ȯ","����..��� ������","2016/05/24");
		ApplicationContext container = 
				new	ClassPathXmlApplicationContext("config/setter.xml");
		ApplicationContext container2 = 
				new	ClassPathXmlApplicationContext("config/setter.xml");
		IWriteArticleMgr writeArticle = (IWriteArticleMgr)container.getBean("WriteArticle");
		writeArticle.write(article);
		IWriteArticleMgr writeArticle2 = (IWriteArticleMgr)container.getBean("WriteArticle");
		//�⺻���¿��� �̱������� Ȯ�� - �⺻���� ���� �������� �ʰ� scope�Ӽ��� prototype���� �����ϸ�
		//					   getBean�� ȣ��� �� ���� ���� �����ȴ�.
		//					   (�⺻�� ApplicationContext��ü�� ������ �� �� ���� �����ȴ�.)
		if(writeArticle==writeArticle2){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
	}

}
