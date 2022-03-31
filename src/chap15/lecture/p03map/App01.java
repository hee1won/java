package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		
		// Map : (Key, Value) 쌍으로 저장 
		// (key, value) : entry, entry는 순서가 없음 
		// key는 중복 안됨 
		
		Map<String, String> map = new HashMap<>();
		
		// put : entry 추가 
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		map.put("tesla", "elon musk");
		
		// size : entry 수 
		int size = map.size();	// int로 리턴 
		System.out.println(size);
		
		// get : key를 사용해서 value 얻음 
		String val1 = map.get("bts");
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		String val4 = map.get("bitcoin");	// 없는값을 꺼내면 null로 나옴 
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
		// keySet : key를 Set타입으로 리턴 
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// 전체탐색 1 : keySet, get
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		// 전채탐색 2 : entrySet
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// remove : key로 entry 삭제 
		map.remove("tesla");
		System.out.println(map.size());
		System.out.println(map);
		
		// containsKey : key가 있는 지 확인 
		System.out.println(map.containsKey("aespa"));
		System.out.println(map.containsKey("tesla"));
	}

}
