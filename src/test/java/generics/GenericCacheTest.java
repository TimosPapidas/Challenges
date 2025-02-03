

package generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GenericCacheTest {
	private GenericCache<String, Integer> testCache;
	@BeforeEach
	void setUp() {
		testCache = new GenericCache<>(3);
		testCache.put("One", 1);
		testCache.put("Two", 2);
		testCache.put("Three", 3);
	}
	@Test
	void testPut() throws NoSuchFieldException, IllegalAccessException {
		Field mapField = testCache.getClass().getDeclaredField("map");
		mapField.setAccessible(true);
		@SuppressWarnings("unchecked")
		LinkedHashMap<String, Integer> map = (LinkedHashMap<String, Integer>) mapField.get(testCache);
		assertEquals(1, map.get("One"));
	}
	@Test
	void testGet(){
		assertEquals(1, testCache.get("One"));
		assertNull(testCache.get("Four"));
	}

	@Test
	void testContainsKey(){
		assert(testCache.containsKey("One"));
		assert(testCache.containsKey("Two"));
		assert(testCache.containsKey("Three"));
		assert(!testCache.containsKey("Four"));
	}
	@Test
	void testRemoveOldestElement(){
		testCache.put("Four", 4);
		assert(!testCache.containsKey("One"));
		assert(testCache.containsKey("Two"));
		assert(testCache.containsKey("Three"));
		assert(testCache.containsKey("Four"));
	}

}