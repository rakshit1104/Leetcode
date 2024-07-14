class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        dataStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (!dataStack.isEmpty()) {
            int removed = dataStack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}