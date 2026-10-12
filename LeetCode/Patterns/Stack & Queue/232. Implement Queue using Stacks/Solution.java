class MyQueue {

    Stack<Integer> og=new Stack<>();
    Stack<Integer> xtra=new Stack<>();
    
    public MyQueue() 
    {
    }
    
    public void push(int x) 
    {
        og.push(x);
    }
    
    public int pop() 
    {
        while(!og.isEmpty())
        {
            xtra.push(og.pop());
        }
        int x=xtra.pop();
        while(!xtra.isEmpty())
        {
            og.push(xtra.pop());
        }
        return x;
    }
    
    public int peek() {
        while(!og.isEmpty())
        {
            xtra.push(og.pop());
        }
        int x=xtra.peek();
        while(!xtra.isEmpty())
        {
            og.push(xtra.pop());
        }
        return x;
        
    }
    
    public boolean empty() {
        return og.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */