public class Deque
{
    final int SIZE;
    int[]list;
    int front;
    int rear;
    int count;
    
    public Deque()
    {
        SIZE = 10;
        list=new int[SIZE];
        front=0;
        count=0;
        rear=0;     
        //initializes everything to 0 to start the new deque
    }
    
    public Deque(int size)
    {
        SIZE = size;
        list=new int[SIZE];
        front=0;
        count=0;
        rear=0;
        //initalizes everything to 0 to start the new deque
    }
    
    public boolean isEmpty()
    {
        return count==0;
        //under the condition that there are no elements in the deque
    }
    
    public void push (int x)
    {        
        if(count>SIZE - 1)
        {
            System.out.println("Full!");
            //once the count is larger than the size-1, it's officially full
        }
        
        else if(isEmpty())
        {
            list[front]=x;
            count++;
            //if it's empty, element gets put to front
        }
        else if (front==0)
        {
            front=SIZE-1;
            list[front]=x;
            count++;
            //the pointer for front moves at the end, and the element is located there at the 'front'
        }
        else
        {
            front--;
            list[front]=x;
            count++;
            //element gets put to front in and pointer points to the left
        }
        //count increments for addition of element
    }
    
    public int pop()
    {
        int x=getFront();
        //gets element so it can be returned once it's popped out
        if(isEmpty())
        {
            System.out.println("No element in deque!");
            //you can't use pop if there's nothing in deque
        }
           
        if(front==rear)
        {
            front=-1;
            count--;
            //the front is put to a different spot from the rear if it's at the same position
            //thus removing the only element there
        }
        else
        {
            if(front==SIZE-1)
            {
                front=0;
                //if pointer of front is at the end it points to the start
            }
            else
            {
                front=front+1;
                //or if it's in a different position, moves pointer to the right
            }
            count--;
            //one less element, thus count decrements
        }
        
        return x;      
    }
    
    public void inject(int x)
    {
        if(count>SIZE-1)
        {
            System.out.println("Full!");
        }
         //once the count is larger than the size, it's officially full

        else if(isEmpty())
        {
            list[rear]=x;
            count++;
            //if it's empty, put at rear since it's the only element
        }
        else if(rear==SIZE-1)
        {
            rear=0;
            list[rear]=x;
            count++;
            // if it's at the last position, pointer points to the start as the rear
        }
        else
        {
            rear=rear+1;
            list[rear]=x;
            count++;
            //points to the position to the right as rear
        }       
        //count increments with additional element
    }
    
    public int eject()
    {
        int x=getRear();
        if(isEmpty())
        {
            System.out.println("No element in deque!");
            //you can't eject if it's an empty deque
        }
        
        else
        { 
            if(front==rear)
        {
            rear=-1;
            //the front is put to a different spot from the rear if it's at the same position
            //thus removing the remaining element
        }
        else if(rear==0)
        {
            rear=SIZE-1;
            //if rear is at the front, the pointer points to the back
        }
        else
        {
            rear--;
            //rear constantly changes pointer position 
        }
            count--;
            //count decrements once element is removed
        }
        
        return x;
    }
    
    public int getFront()
    {
        if(isEmpty())
        {
            System.out.println("Empty!");
            //tells you it's empty, thus there can be no front
        }
        return list[front];
        //returns value at front
    }
    
    public int getRear()
    {
        if(isEmpty())
        {
            System.out.println("Empty!");
            //tels you it's empty, thus there can be rear
        }
        return list[rear];
        //returns value at rear
    }
}
