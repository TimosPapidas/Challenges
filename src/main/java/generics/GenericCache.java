package generics;

import java.util.LinkedHashMap;

public class GenericCache<K, V> {
	private LinkedHashMap<K, V> map;
	private int capacity;

	public GenericCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<>(capacity, 0.75f, false);
	}
	void put(K key, V value) {
		if (map.size() < capacity) {
			map.put(key, value);
		} else if (map.size() == capacity) {
			map.remove(map.keySet().iterator().next());
			map.put(key, value);
		}
	}
	V get(K key) {
		return map.get(key);
	}
	boolean containsKey(K key) {
		return map.containsKey(key);
	}
}