package week_03;

public class logic {
int front, rear, capacity;
int queue[];

logic(int c){
	front=rear=0;
	capacity=c;
	queue=new int[capacity];
}
void insert(int data) {
	if(capacity==rear) {
		System.out.println("Queue is Full.");
		return;
	}
	else {
		queue[rear]=data;
		rear++;
	}
	return;
}
void delete() {
	if(front==rear) {
		System.out.println("Queue is empty.");
		return;
	}
	else {
		for(int i=0;i<rear-1;i++) {
			queue[i]=queue[i+1];
		}
		if(rear<capacity) {
			queue[rear]=0;
		}
		rear--;
	}
	return;
}

void print() {
	
	if(front==rear) {
		System.out.println("Queue is Empty.");
		return;
	}
	for(int i=front;i<rear;i++) {
		System.out.println(+queue[i]);
	}
	return;
}
void front() {
	if(front==rear) {
		System.out.println("Queue is Empty");
		return;
	}
	System.out.println("Front is :"+ queue[front]);
	return;
}


}
