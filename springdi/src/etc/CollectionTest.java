package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String, String> map;
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	public void getList(){
		//ArrayList�� �����͸� ���
		System.out.println("**********ArrayList�� ����� ��ҵ�**********");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public void getMap(){
		System.out.println("**********HashMap�� ����� ��ҵ�**********");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key+":"+map.get(key));
			
		}
	}
	
	
	
}
