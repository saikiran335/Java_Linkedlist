public class deletenodeatlast
{
class Node{
int data;
Node next;


public Node(int data)
{
this.data=data;
this.next=null;
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
}
else
{
tail.next=newnode;
tail=newnode;
}

}

public void deletelast()
{
if(head==null)
{
System.out.println("empty list");
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
tail.next=null;
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
return;
}
while(current!=null)
{
System.out.print(current.data + " ");
current=current.next;
}
System.out.println();

}
public static void main(String[] args)
{
deletenodeatlast last=new deletenodeatlast();

last.addnode(1);
last.addnode(2);
last.addnode(3);
last.addnode(4);
last.addnode(5);

last.display();
while(last.head!=null)
{
last.deletelast();
last.display();
}
}
}


