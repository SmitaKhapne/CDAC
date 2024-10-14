
public class FlattenMultilevel 
{
	static Node head;
	Node tail;
	static class Node
	{
		int data;
		Node next, prev;
		
		Node(int data)
		{
			this.data = data;
			next = prev = null;
		}
	}
	
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = tail = new Node(new_data);
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		tail.next = new_node;
		tail = new_node;
	}
	
	static void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	static void joinList(Node fm1, Node fm2)
	{
		Node temp = head;
		if(fm1.next != null)
		{
			temp = temp.next;
		}
		fm1.next = fm2;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		FlattenMultilevel fm1 = new FlattenMultilevel();
		System.out.println("enter size");
		int size1 = sc.nextInt();
		for(int i=0; i<size1; i++)
		{
			fm1.append(sc.nextInt());
		}
		fm1.display();
		
		FlattenMultilevel fm2 = new FlattenMultilevel();
		System.out.println("enter size");
		int size2 = sc.nextInt();
		for(int i=0; i<size2; i++)
		{
			fm1.append(sc.nextInt());
		};
		fm2.display();
//		FlattenMultilevel fm3 = new FlattenMultilevel();
//		System.out.println("enter size");
//		int size3 = sc.nextInt();
//		for(int i=0; i<size3; i++)
//		{
//			fm1.append(sc.nextInt());
//		}
//		fm3.display();
		
		//System.out.println();
		joinList(fm1.head, fm2.head);
		display();
		
	}

}