package Stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(100);
        stack.push(5);
        stack.push(10);
        System.out.println("-" +stack.pop()+"-");
        System.out.println("="+stack.top() + "=");
        System.out.println(stack);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}
