class MinStack {

    private final Stack<StackNode> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(new StackNode(val,val));
        }else{
            stack.push(new StackNode(val, Math.min(stack.peek().minAtThisPoint, val)));
        }
        
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().minAtThisPoint;
    }
}

class StackNode{

    StackNode(int val, int minAtThisPoint){
        this.val = val;
        this.minAtThisPoint = minAtThisPoint;

    }
    int val;
    int minAtThisPoint;
}
