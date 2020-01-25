package week_03;
import java.util.ArrayList;
import java.util.List;
public class Deque {

	private List<Integer> deque = new ArrayList<Integer>();
	public void insertFront(int item){
	
	System.out.println("element added at front: "+item);
	deque.add(0,item);
	System.out.println(deque);
	}
	public void insertRear(int item){
	System.out.println("element added at rear: "+item);
	deque.add(item);
	System.out.println(deque);
	}
	public void removeFront(){
	if(deque.isEmpty()){
	System.out.println("Deque underflow, unable to remove.");
	return;
	}

	int rem = deque.remove(0);
	System.out.println("element removed from front: "+rem);
	System.out.println(deque);
	}
	 
	public void removeRear(){
	if(deque.isEmpty()){
	System.out.println("Deque underflow, unable to remove.");
	return;
	}
	int rem = deque.remove(deque.size()-1);
	System.out.println("element removed from front: "+rem);
	System.out.println(deque);
	}
	 
	public int peakFront(){
	int item = deque.get(0);
	System.out.println("Element at first: "+item);
	return item;
	}

	public int peakRear(){
	int item = deque.get(deque.size()-1);
	System.out.println("Element at rear: "+item);
	return item;
	}
}
