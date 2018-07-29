package io.hr.hashcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashcode {
	public static void main(String[] args) {

		// linkedhashmap will maintain the inseration order.
		// Addition of values of duplicate key.
		Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();
		map.computeIfAbsent("A", k -> new ArrayList<>()).add(5);
		map.computeIfAbsent("B", k -> new ArrayList<>()).add(3);
		map.computeIfAbsent("A", k -> new ArrayList<>()).add(2);
		map.computeIfAbsent("B", k -> new ArrayList<>()).add(3);
		map.computeIfAbsent("D", k -> new ArrayList<>()).add(6);
		map.computeIfAbsent("D", k -> new ArrayList<>()).add(7);
		map.computeIfAbsent("A", k -> new ArrayList<>()).add(5);
		map.computeIfAbsent("B", k -> new ArrayList<>()).add(3);
		map.computeIfAbsent("A", k -> new ArrayList<>()).add(2);
		map.computeIfAbsent("B", k -> new ArrayList<>()).add(3);
		map.computeIfAbsent("C", k -> new ArrayList<>()).add(6);
		map.computeIfAbsent("D", k -> new ArrayList<>()).add(7);

		for (String name : map.keySet()) {

			int total = 0;
			try {
				for (int i = 0; i <= map.get(name).size(); i++) {
					total += map.get(name).get(i);

				}

			} catch (IndexOutOfBoundsException e) {
				// System.out.println(e);
			}
			System.out.println("the size of : " + name + " is " + map.get(name).size() + " with members "
					+ map.get(name) + " sum of all members : " + total);

		}

	}

}
