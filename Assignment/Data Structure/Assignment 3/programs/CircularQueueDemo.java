
import java.util.Arrays;
import java.util.Scanner;

public class CircularQueueDemo 
{
	int size=4;
	int rear, front;
	int[] arr = new int[size];
	
	CircularQueueDemo() 
	{
		rear = -1;
		front = -1;
	}
	
	boolean isEmpty()
	{
		return (front == -1);
	}
	
	boolean isFull()
	{
		return ((rear+1) %size == front);
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		else
		{
			if(front == -1)
			{
				front = 0;
			}
			if(rear == size-1)
			{
				rear = -1;
			}
				rear= (rear+1) % size;
				arr[rear] = x;
				//System.out.println(x);
		
		}
	}
	
	
	int dequeue()
	{
		
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int x = arr[front];
			System.out.println("deleted : " + x);
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
				front = (front+1) % size ;
			return x;
		}
	}
	
	
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else
		{
			int trav = front;
			while(trav != rear)
			{
				System.out.print(arr[trav] + " ");
				trav = (trav+1)%size;
			}
			System.out.print(arr[rear]);
			System.out.println();
		}
	}
	
	void reverseDisplay()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return;
		}
		else
		{
			int trav = rear;
			while(trav != front)
			{
				System.out.print(arr[trav] + " ");
				trav = (trav-1)%size;
				if(trav == -1)
				{
					trav = size -1;
				}
			}
			System.out.print(arr[front]);
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CircularQueueDemo cq = new CircularQueueDemo();
		for(int i=0; i<4; i++)
		{
			cq.enqueue(sc.nextInt());
		}
		cq.display();
		
		cq.dequeue();
		cq.display();
		
		System.out.println("enter new elements");
		cq.enqueue(sc.nextInt());
		System.out.println(Arrays.toString(cq.arr));
		
		System.out.println("case 2");
		CircularQueueDemo cq1 = new CircularQueueDemo();
		for(int i=0; i<4; i++)
		{
			cq1.enqueue(sc.nextInt());
		}
		cq1.display();
		
		cq1.dequeue();
		cq1.dequeue();
		cq1.display();
		
		System.out.println("enter new elements");
		cq1.enqueue(sc.nextInt());
		cq1.reverseDisplay();
		
		

	}

}