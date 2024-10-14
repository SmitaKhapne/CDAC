public class QueueDemo
{
	int rear, front;
	int size;
	int[] arr;
	QueueDemo1(int size) 
	{
		rear = -1;
		front = -1;
		this.size = size;
		arr = new int[size];
		//this.size = arr.length;
	}
	
	boolean isEmpty()
	{
		return (front == -1);
	}
	
	boolean isFull()
	{
		return (rear == size-1);
	}
	
	int enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return -1;
		}
		else
		{
			if(front == -1)
			{
				front = 0;
			}
			return arr[++rear] = x;
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
				if(front > rear)
				{
					front = -1;
					rear = -1;
				}
				int x =arr[front++];
				System.out.println("Dequeued element : " + x);
				return x;
			}
		}

		void display()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
			}
			else
			{
				for(int i=front; i<= rear; i++)
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	
	public static void main(String[] args)
	{
		
		QueueDemo queue = new QueueDemo(2);
		queue.enqueue(5);
		queue.enqueue(10);
		
		queue.display();
		
		queue.dequeue();
		queue.display();
		
		System.out.println("******************************");
		
		QueueDemo queue1 = new QueueDemo(3);
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		
		queue1.display();
		
		queue1.dequeue();
		queue1.dequeue();
		queue1.display();
		

	}

}