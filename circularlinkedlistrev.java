class circularlinkedlistrev
{
public class Node
{
int data;
Node next;
public Node(int data)
{
this.data=data;
}
}
public Node head=null;
public Node tail=null;

public void addnode(int data)
{
Node newnode=new Node(data);
if(head==null)
{
head=newnode;
tail=newnode;
newnode.next=head;
}
else{
tail.next=newnode;
tail=newnode;
tail.next=head;
}
}
public void display()
{
Node current=head;
if(head==null)
{
System.out.println("emptylist");
}
else{
do{
System.out.print(current.data + " ");
current=current.next;

}while(current!=head);
System.out.println();

}
}

public void reverse(Node current) 
{          
if(current.next == head) {  
System.out.print(" "+current.data);  
return;  
}  
reverse(current.next);  
System.out.print(" "+current.data);  
}


public static void main(String[] args)
{
circularlinkedlistrev circular=new circularlinkedlistrev();

circular.display();
circular.addnode(0);
circular.addnode(1);
circular.addnode(2);
circular.addnode(3);
circular.addnode(4);
circular.addnode(5);
circular.addnode(6);
circular.addnode(7);
circular.addnode(8);
circular.addnode(9);

circular.display();
System.out.println();

circular.reverse(circular.head);
circular.display();

}
}
