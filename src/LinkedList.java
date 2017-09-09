class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void push_Data(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void pushAfeter(Node prev,int new_data)
	{
		if(prev.next==null)
		{
			System.out.println("prev no must be not 0");
			return ;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev.next;
		prev.next=new_node;	
				
	}
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null)
			last=last.next;
		last.next=new_node;
	}
	public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
	public static void main(String[]args)
	{
		LinkedList ll=new LinkedList();
		ll.append(6);
		ll.push_Data(4);
		ll.push_Data(10);
		ll.push_Data(2);
		ll.push_Data(3);
		ll.pushAfeter(ll.head.next.next, 9);
		System.out.println("Linked list is:");
		ll.printList();
		
	}
}