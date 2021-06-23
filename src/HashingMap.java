import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HashingMap {
	private static LinkedList<KeyValuePair>[] HashMap;
	
	private static void put(int x, int y) {
		KeyValuePair record = new KeyValuePair(x, y);
		 int hashKey = HashiKey(x);
	 if(HashMap[hashKey] == null) {
		 HashMap[hashKey] = new LinkedList<KeyValuePair>();
	 }
	 HashMap[hashKey].add(record);
	}
	
	private static int get(int x) {
		int hashkey = HashiKey(x);
		LinkedList<KeyValuePair> head = HashMap[hashkey];
		
		if(head == null ) return -1;
		for (int pos = 0; pos < head.size(); ++pos) {
			if (head.get(pos).getKey() == x) {
				return head.get(pos).getValue();
			}
		}
		return -1;
	}
	public static void remove(int key) {
		put(key, -1);
	}
	public static void main(String[] args) {
		 int n = 100;
		 HashMap = new LinkedList[n];
		 //System.out.println(HashMap.length);
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 24; i++) {
			 int key = sc.nextInt();
			 int value = sc.nextInt();
			 
			 put(key, value);
			 
			 
		}
		
		int key = sc.nextInt();
		int ans  = get(key);
		key = sc.nextInt();
		remove(key);
		
		
	
		
	}
	
	private static int HashiKey(int i) {
		// TODO Auto-generated method stub
	
		return i;
	}

}
