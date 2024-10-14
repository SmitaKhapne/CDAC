public class Question4 
{
	Node head;
	Node tail;
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

	void insertLast(int new_data)
	{
		if(head == null)
		{
			head = tail = new Node(new_data);
			return;
		}
		
		Node new_node = new Node(new_data);
		tail.next = new_node;
		tail = new_node;
	}	
		
	Node mergeList(Node n1, Node n2)
	{
		if(n1 == null)
			return n2;
		
		if(n2 == null)
			return n2;
		
		if(n1.data < n2.data)
		{
			n1.next = mergeList(n1.next, n2);
			return n1;
		}
		else
		{
			n2.next = mergeList(n1, n2.next);
			return n2;
		}
		
	}
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data +" ");
			n=n.next;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Question4 q = new Question4();
		
		System.out.print("List size1: " );
		int size1 = sc.nextInt();
		
		for(int i=0; i<size1; i++)
		{
			q.insertLast(sc.nextInt());
		}
		q.display();
		System.out.println();
		
		Question4 q1 = new Question4();
		System.out.print("enter size 2: ");
		int size2 = sc.nextInt();
		for(int i=0; i<size2; i++)
		{
			q1.insertLast(sc.nextInt());
		}
		q1.display();
		System.out.println();
		
		Node temp = q.mergeList(q.head, q1.head);   //important
		q.head = temp;
		q.display();
	}
