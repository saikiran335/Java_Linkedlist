public class singlylinkedlistsearch
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

public void searchnode(int data)
{
Node current=head;
int i=1;
boolean flag=false;
if(head==null)
{
System.out.println("empty list");
}

else
{
while(current!=null)
{
if(current.data==data)
{
flag=true;

break;
}
i++;
current=current.next;
}
}
if(flag)
{
System.out.println("is found at" + i);
}
else
{
System.out.println("element is not found");
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
System.out.print(current.data +" " );
current=current.next;
}
System.out.println();
}



public static void main(String[] args)
{

singlylinkedlistsearch single=new singlylinkedlistsearch();
single.addnode(1);    
single.addnode(2);    
single.addnode(3);    
single.addnode(4);        
single.display();
single.searchnode(3);
single.searchnode(6);
single.searchnode(4);      
}    
}
