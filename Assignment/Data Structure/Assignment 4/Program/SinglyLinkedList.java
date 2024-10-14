public class SinglyLinkedList 
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
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void deleteNode(int key)
	{
		Node temp = head;
		Node prev = null;
		
		if(head != null && temp.data == key)
		{
			temp= temp.next;
			return;
		}
		
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
			return;
		prev.next = temp.next;
	}
	
	boolean search(int key)
	{
		Node temp = head;
		while(temp.data != key)
		{
			temp = temp.next;
			return false;
		}
		return true;
		
	}
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n=n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtBeginning(3);
		list.insertAtBeginning(7);
		list.insertAtBeginning(5);
		
		list.display();
		System.out.println();
		
		list.deleteNode(7);
		list.display();
		
		boolean res = list.search(5);
		if(res == true)
		{
			System.out.println("Found = true");
		}
		else
		{
			System.out.println("Found = false");
		}

	}

}