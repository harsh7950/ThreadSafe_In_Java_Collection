import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMostFrequentElement(new int[] { 4, 5, 4, 5, 8, 7, 4, 7, 6, 7 });

		getMostFrequentElement(new int[] { 1, 2, 7, 5, 3, 6 });

	}

	private static void getMostFrequentElement(int[] is) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i : is) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);

		int element = 0;
		int frequency = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > frequency) {
				System.out.println("THe most repeated number is : " + entry.getKey());
				System.out.println("Frequency of that key is :" + entry.getValue());
			}

		}

	}

}
