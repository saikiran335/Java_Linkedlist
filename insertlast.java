class insertlast
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
int size;
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
size++;
}

public void insertnode(int data)
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
System.out.print(current.data+ " ");
current=current.next;
}
System.out.println();
}

public static void main(String[] args)
{
insertlast insert=new insertlast();
insert.addnode(1);
insert.addnode(2);
insert.addnode(3);
insert.addnode(6);
insert.addnode(7);

insert.display();

insert.insertnode(5);
insert.display();

insert.insertnode(4);
insert.display();
}
}