public class LinkedListNodeFinder 
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
	
	void append(int new_data)
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
	
	void reverseLinkedList()
	{
		Node current = head;
		Node next = null;
		Node prev = null;
		
		while (current != null) 
		{
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		head = prev;
		
	}
	
	int findValueAtPosition(int position) 
	{
		if (head == null)
		{
			System.out.println("List is empty");
			return 0;
		}
		
		int counter = 1;
		Node trav = head;
		while (trav != null)
		{
			if (counter == position)
				return trav.data;
			
			trav = trav.next;
			counter++;
		}
		
		return 0;
	}
	
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedListNodeFinder list = new LinkedListNodeFinder();
		System.out.print("enter size: ");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			list.append(sc.nextInt());
		}
		
		list.display();
		
		System.out.println();
		
		list.reverseLinkedList();
		//list.display();
		
		System.out.println("enter node position whose value need to check");
		int position = sc.nextInt();
		
		System.out.println(list.findValueAtPosition(position));
		
	}

}
