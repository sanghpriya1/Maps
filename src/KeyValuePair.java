
public class KeyValuePair {
	
	private int key;
	private int value;
	KeyValuePair next;
	
	public KeyValuePair() {
		
	}
	public KeyValuePair(int key, int value ) {
		
		this.key = key;
		this.value = value;
		
	}
	public int getKey() {
		return key;
	}
//	public void setKey(int key) {
//		this.key = key;
//	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "KeyValuePair [key=" + key + ", value=" + value + ", next=" + next + "]";
	}
	
	
}
