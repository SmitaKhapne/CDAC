
import java.util.Scanner;

public class DoublyLinkedListReversor 
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
	
	void insert(int new_data)
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
	
	void reverserList()
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		Node current = head;
		Node nextNode  = null;
		while(current != null)
		{
			nextNode = current.next;
			
			current.next = current.prev;
			current.prev = nextNode;
			
			if(nextNode == null)
			{
				head = current;
			}
			current = nextNode;
		}
		
	}
	
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data +" ");
			n = n.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DoublyLinkedListReversor db = new DoublyLinkedListReversor();
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			db.insert(sc.nextInt());
		}
		
		db.display();
		
		db.reverserList();
		db.display();

	}

}