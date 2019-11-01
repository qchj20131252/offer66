import java.util.Stack;

/**
 * @author 秦川江
 * @date 2019/11/1 15:25
 * @info 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class ImplementQueueusingStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public void stack2stack(Stack<Integer> stk1, Stack<Integer> stk2) {
        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }
    }

    public int pop() {
        stack2stack(stack1, stack2);
        int popVal = stack2.pop();
        stack2stack(stack2, stack1);
        return popVal;
    }

    /**
     * 当stack2为空时，我们把stack1全部压入stack2，这时我们不管是做push、pop等操作的时候，一切都跟Queen一样，省去了反复的复制，清空操作。
     * @return
     */
    public int pop2() {
        if (stack2.isEmpty()) {
            stack2stack(stack1, stack2);
        }
        return stack2.pop();
    }

    /** Get the front element. */
    int peek() {
        stack2stack(stack1, stack2);
        int peekVal = stack2.peek();
        stack2stack(stack2, stack1);
        return peekVal;
    }

    /** Returns whether the queue is empty. */
    boolean empty() {
        return stack1.isEmpty();
    }
}
