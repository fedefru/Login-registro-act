package Hello;
import java.util.HashMap;
import java.util.Map;



public class DummyBase {

	private static Map<String,String> mapa;
	
	static {
		
		mapa = new HashMap<String, String>();
		
    mapa.put("fede", "1234");
    mapa.put("mario", "4321");
    mapa.put("chile", "1234");
    mapa.put("javi", "9876");
	}

	public static Map<String, String> getMap() {
		return mapa;
	}
	
	public static Map<String,String>setMap(String userN,String passN){
		mapa.put(userN, passN);
		return mapa;
	}
	
	

}
