public class Main
{
    public static void main (String args[])
    {
        Deque D1= new Deque();
        System.out.println("Deque created!");
        //creates new Deque with automatic size of 10
        
        System.out.println("Is it empty: " + D1.isEmpty());
        //check if it's empty
        
        System.out.println("Eject!");
        D1.eject();
        //checks for case that one tries to eject from an empty deque
        
        System.out.println("Input 1"); 
        D1.push(1);
        //input of 1 entered
        
        System.out.println("Is it empty: " + D1.isEmpty());
        //checks if it's empty
        
        System.out.println("Front: " + D1.getFront());
        //checks front value
        
        System.out.println("Inputs of 2 and 3 entered!");
        D1.push(2);
        D1.inject(3);
        System.out.println("Front: Should be 2: " + D1.getFront());
        System.out.println("Rear: Should be 3: " + D1.getRear());
        //puts 2 to front and checks and puts 3 to rear and checks
        
        System.out.println("Inputs 4-9 entered!");
        for (int index = 4; index <= 9; index ++)
        {
            D1.inject(index);
        }
        //injects additional values
        
        System.out.println("Input of 10 entered!");
        D1.push(10);
        //puts 10 to front
        
        System.out.println("Input of 11 entered!");
        D1.push(11);
        //checks to see if additional values can be inputted
        
        
        System.out.println("Front should be 10: " + D1.getFront());
        //checks to see if 10 is in front
        
        System.out.println("End should be 9: " + D1.getRear());
        //checks to see if 9 is in rear
        
        System.out.println("Value in front popped and value in back ejected!");
        
        System.out.println("Value popped " + D1.pop());
        System.out.println("Front should be 2: " + D1.getFront());
        System.out.println("Value ejected " + D1.eject());
        System.out.println("Rear should be 8: " + D1.getRear());
        
  
    }
}
