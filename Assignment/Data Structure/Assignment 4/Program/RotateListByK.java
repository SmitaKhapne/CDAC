import java.util.Scanner;

public class RotateListByK 
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
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = tail = new Node(new_data);;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp= temp.next;
		}
		tail.next = new_node;
		tail = new_node;
		
	}
	
	void rotateListFromPosition(int position)
	{
		Node current = head;
		Node trav = null;
		int i;
		for( i=0; i<position-1; i++)
		{
			current = current.next;		
		}	
		while(current.next != null)
		{
			if( i == position)
			{
				tail.next = head;
				current.next = head;
				current.next = trav;
			}
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
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		RotateListByK rk = new RotateListByK();
		
		System.out.println("enter size of linked list");
		int size  = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			rk.append(sc.nextInt());
		}
		 System.out.println("enter a key value");
		 int position = sc.nextInt();
		 rk.rotateListFromPosition(position);
		 rk.display();

	}

}
