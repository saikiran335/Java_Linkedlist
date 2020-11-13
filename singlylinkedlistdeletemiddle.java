public class singlylinkedlistdeletemiddle
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
public int size;

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


public void deletenode()
{
Node temp,current;
if(head==null)
{
System.out.println("empty list");
return;
}
else
{
int count=(size % 2==0) ? (size/2) : ((size+1)/2);
if(head!=tail)
{
temp=head;
current=null;
for(int i=0;i<count-1;i++)
{
current=temp;
temp=temp.next;
}
if(current!=null)
{
current.next=temp.next;
temp=null;
}
else 
{  
head = tail = temp.next;   
temp = null;  
}  
}  
else 
{  
head = tail = null;  
}  
}  
size--;  
} 






public static void main(String[] args)
{

singlylinkedlistdeletemiddle single=new singlylinkedlistdeletemiddle();
single.addnode(1);    
single.addnode(2);    
single.addnode(3);    
single.addnode(4);        
single.display();
while(single.head!=null)
{
single.deletenode();
System.out.println("new list:");
single.display();
}
  
 
    }    
}    

