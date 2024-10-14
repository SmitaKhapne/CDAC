public class DoubleLinkedList 
{
	Node head;
	static class Node
	{
		int data;
		Node prev, next;
		
		Node(int data)
		{
			this.data = data;
			prev = next = null;
		}
	}
	
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new_node;
		new_node.prev = temp;
				
	}

	void deleteNode(int key)
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		
		Node temp = head;
		
		while(temp != null)
		{
			if(temp.data == key)
			{
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				return;
			}
			
			temp = temp.next;
		}
		
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
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DoubleLinkedList list = new DoubleLinkedList();
		int size = sc.nextInt();
		for(int i=0; i<size; i++)
		{
			list.append(sc.nextInt());
		}
		
		
		list.display();
		System.out.println();
		
		System.out.println("enter value for deletion");
		int val = sc.nextInt();
		list.deleteNode(val);
		list.display();

	}

}
