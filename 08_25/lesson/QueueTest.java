//package jp01.part09;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		String value = new String("1 : ȫ�浿");
		queue.offer(value);
		queue.offer(new String("2 : �̼���"));
		queue.offer("3 : �ָ�");
		System.out.println(queue);
		
		
		String str1 = (String)queue.poll();
		System.out.println(str1 + "poll");
		System.out.println(queue);


/*
		String str2 = (String)queue.peek();
		System.out.println(str2);

		while (queue.peek() != null) {
			String str3 = (String)queue.poll();
			System.out.println(str3);
		}
		*/
	}
}
