import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap {
	private int n = 100;
	List<List<KeyValuePair>> HashMap = new LinkedList<List<KeyValuePair>>();
	for(int i = 0; i < n; i++) {
		HashMap.add(i, new LinkedList<KeyValuePair>());
		
		
	}
	
	public void put(int x, int y) {
		KeyValuePair entry = new KeyValuePair(x, y);
		int hashKey = HashFunction(x);
		HashMap.add(hashKey, );
	}


	private int HashFunction(int x) {
		return x;
	}

	
	
	
	

}
