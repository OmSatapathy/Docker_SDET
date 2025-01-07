package core.dec30;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Hahmap {

	public static void main(String[] args) {

		Map<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
		hm.put(2, "rakesh");
		hm.put(12, "mukesh");
		hm.put(23, "suresh");
		hm.put(24, "maish");
		hm.put(25, "paresh");

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {

			System.out.println(entry.getValue().charAt(2));
			hm.put(33, "sachin");

		}

	}

}
