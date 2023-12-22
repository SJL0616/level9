package _11콜렉션Member;

import java.util.HashMap;
import java.util.Map;

public class Controller {

	private Controller() {
		// TODO Auto-generated constructor stub
	}
	
	private static Controller instance = new Controller();
	public static Controller getInstance() {
		return instance;
	}
	
	private Map<String , Action> mapList;
	public void init() {
		mapList = new HashMap<>();
		mapList.put("insert", new ActionInsert());
		mapList.put("delete", new ActionDelete());
		mapList.put("update", new ActionUpdate());
		mapList.put("print", new ActionPrint());
		mapList.put("save", new ActionFileSave());
		mapList.put("load", new ActionFileLoad());
	}
	
	public Action getAction(String key) {
		return mapList.get(key);
	}
	
}
