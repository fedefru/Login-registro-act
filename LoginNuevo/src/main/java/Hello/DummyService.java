package Hello;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
		
	Map<String, String> dB = DummyBase.getMap();
	
	public boolean getAtribute(String user, String pass) {
		
		return (DummyBase.getMap().containsKey(user) && DummyBase.getMap().containsValue(pass));
	}
	
		public static void setAtribute(String user, String pass) {
			
		 DummyBase.setMap(pass, pass);	 
	}
	
	public void registerUser(String user, String password) {
		dB.put(user, password);
	}
}
