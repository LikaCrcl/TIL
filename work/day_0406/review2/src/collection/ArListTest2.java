package collection;

import java.util.ArrayList;

public class ArListTest2 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(30);
		list.get(1).add(40);
		list.get(1).add(50);
		list.get(1).add(60);
		list.get(2).add(70);
		list.get(2).add(80);
		list.get(2).add(90);
	}
}
