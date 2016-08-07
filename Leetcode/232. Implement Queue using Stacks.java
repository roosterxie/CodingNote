class MyQueue {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();//opposite stack
    int top = 0;

    // Push element x to the back of queue
    public void push(int x) {
        if(s1.empty())
            top=x;
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(s2.empty()){
            while(!s1.empty())
                s2.push(s1.pop());
        }
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        if(!s2.empty())
            return  (int)s2.peek();
        return top;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.empty()&&s2.empty();
    }
}


/*
   boolean usemain = true;

    // Push element x to the back of queue
    public void push(int x) {
        if(!usemain){
            usemain = true;
            while(!secondstack.empty()){
                mainstack.push(secondstack.pop());
            }

        }
        mainstack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(usemain){
            usemain = false;
            while(!mainstack.empty()){
                secondstack.push(mainstack.pop());
            }

        }
        secondstack.pop();
    }

    // Get the front element.
    public int peek() {
        if(usemain){
            usemain = false;
            while(!mainstack.empty()){
                secondstack.push(mainstack.pop());
            }

        }
        return (int)secondstack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return mainstack.empty()&&secondstack.empty();
    }
*/