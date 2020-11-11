public class singlylinkedlist
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

public int countnodes()
{    
int count = 0;        
Node current = head;    
while(current != null) {    
count++;    
current = current.next;    
}    
return count;    
}  



public static void main(String[] args)
{

singlylinkedlist single=new singlylinkedlist();
single.addnode(1);    
single.addnode(2);    
single.addnode(3);    
single.addnode(4);        
single.display();  
System.out.println(single.countnodes());  
    }    
}    

