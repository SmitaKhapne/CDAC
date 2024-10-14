public class CycleLoopDetector 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	void insertAtBeginning(int new_data)
	{
		Node temp =head;
		
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void circularLoop()
	{
		Node tail = head;
		while(tail.next != null)
		{
			tail =  tail.next;
		}
		tail.next = head;
	}
	void loopDetector()
	{
		Node temp = head;
		
		
		Node slow = temp;
		Node fast = temp;
		
		while(slow.next != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow == fast)
		{
			System.out.println("Detected loop");
		}
		else
		{
			System.out.println("No cycle");
		}
	}
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data + " ");
			n= n.next;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CycleLoopDetector cloop = new CycleLoopDetector();
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("enter elements");
		for(int i=0; i<size; i++)
		{
			cloop.insertAtBeginning(sc.nextInt());
		}
		
		cloop.circularLoop();
		cloop.loopDetector();
		cloop.display();
	}

}