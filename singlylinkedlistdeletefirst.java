public class singlylinkedlistdeletefirst
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


public void deletestart()
{
Node current=head;
if(head==null)
{
System.out.println("empty list");
return;
}
else
{
if(head!=tail)
{
head=head.next;
}
else
{
head=tail=null;
}
}
}





public static void main(String[] args)
{

singlylinkedlistdeletefirst single=new singlylinkedlistdeletefirst();
single.addnode(1);    
single.addnode(2);    
single.addnode(3);    
single.addnode(4);        
single.display();
while(single.head!=null)
{
single.deletestart();
System.out.println("new list:");
single.display();
}
  
 
    }    
}    

