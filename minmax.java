class minmax
{
class Node
{
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
Node newnode=new Node(data);
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

public void minnode()
{
Node current=head;
int min;

if(head==null)
{
System.out.println("empty list");
}
else
{
min=head.data;

while(current!=null)
{
if(min>current.data)
{
min=current.data;
}
current=current.next;
}
System.out.println("the min value is: "+min);
}
}


public void maxnode()
{
Node current=head;
int max;

if(head==null)
{
System.out.println("empty list");
}
else
{
max=head.data;

while(current!=null)
{
if(max<current.data)
{
max=current.data;
}
current=current.next;
}
System.out.println("the max value is: "+max);
}
}

public void display()
{
Node current=head;

if(head==null)
{
System.out.println("empty list");
}
while(current!=null)
{
System.out.print(current.data+" ");
current=current.next;
}
System.out.println();
}

public static void main(String [] args)
{
minmax list=new minmax();



list.addnode(1);
list.addnode(4);
list.addnode(5);
list.addnode(3);
list.addnode(7);
list.addnode(9);
list.addnode(2);
list.addnode(6);
list.addnode(8);
list.addnode(0);

list.display();


list.minnode();
list.maxnode();
}
}
