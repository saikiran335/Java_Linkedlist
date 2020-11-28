public class circularlinkedlistdeletelast
{
public class Node{
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
Node newnode = new Node(data);

if(head==null)
{
head=newnode;
tail=newnode;
newnode.next=head;
}
else
{
tail.next=newnode;
tail=newnode;
tail.next=head;
}

}

public void deletelast()
{
if(head==null)
{
return;
}
else
{
if(head!=tail)
{
Node current=head;
while(current.next != tail)
{
current=current.next;
}
tail=current;
tail.next=head;
}
else
{
head=tail=null;
}
}
}
public void display()
{
Node current=head;
if(head==null)
{
System.out.println("empty list");

}

else
{
do
{
System.out.print(current.data + " ");
current=current.next;
}while(current!=head);

System.out.println();
}
}
public static void main(String[] args)
{
circularlinkedlistdeletelast circular=new circularlinkedlistdeletelast();

circular.display();
circular.addnode(1);
circular.addnode(2);
circular.addnode(3);
circular.addnode(4);
circular.addnode(5);
circular.addnode(6);
circular.addnode(7);
circular.addnode(8);
circular.addnode(9);
circular.addnode(0);
circular.display();
while(circular.head!=null)
{
circular.deletelast();
circular.display();
}
}
}


