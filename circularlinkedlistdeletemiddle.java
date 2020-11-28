public class circularlinkedlistdeletemiddle
{
class Node
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
public int size;

public void addnode(int data)
{
Node newnode=new Node(data);

if(head==null)
{
head=newnode;
tail=newnode;
tail.next=head;
}
else
{
tail.next=newnode;
tail=newnode;
tail.next=head;
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
else{
do
{
System.out.print(current.data +" " );
current=current.next;
}while(current!=head);

System.out.println();
}
}


public void deletenode()
{
Node temp,current;
if(head==null)
{
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

circularlinkedlistdeletemiddle circular=new circularlinkedlistdeletemiddle();
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
circular.deletenode();
System.out.println("new list:");
circular.display();
}
  
 
    }    
}    

