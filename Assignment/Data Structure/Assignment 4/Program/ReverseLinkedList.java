
public class ReverseLinkedList 
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

	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	void linkedListReversor()
	{
		Node current = head;
		
		Node prev = null;
		Node next = null;
		
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ReverseLinkedList list = new ReverseLinkedList();
		System.out.println("Array size");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			list.insert(sc.nextInt());
		}
		
		list.display();
		
		list.linkedListReversor();
		list.display();

	}

}
