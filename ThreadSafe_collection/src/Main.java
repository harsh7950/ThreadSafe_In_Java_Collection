import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		threadSafeList.add("geek");
		threadSafeList.add("code");
		threadSafeList.add("practice");

		System.out.println("Elements of synchronized ArrayList :");

		// Iterating on the synchronized ArrayList using iterator.
		Iterator<String> it = threadSafeList.iterator();
//
		while (it.hasNext())
			System.out.println(it.next());
//		it.remove();

		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

		syncList.add("one");
		syncList.add("two");
		syncList.add("three");

		// when iterating over a synchronized list, we need to synchronize access to the
		// synchronized list
		synchronized (syncList) {
			Iterator<String> iterator = syncList.iterator();
			while (iterator.hasNext()) {
				System.out.println("item: " + iterator.next());
				//	syncList.remove(1);
			}
		}
	}
}
