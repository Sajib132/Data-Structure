package week_03;

public class Demain {

	public static void main(String[] args) {
		Deque deq = new Deque();
		deq.insertFront(34);
		deq.insertRear(45);
		deq.removeFront();
		deq.removeFront();
		deq.removeFront();
		deq.insertFront(21);
		deq.insertFront(98);
		deq.insertRear(5);
		deq.insertFront(43);
		deq.removeRear();
	}
}
