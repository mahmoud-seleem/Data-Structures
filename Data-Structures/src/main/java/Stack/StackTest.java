package Stack;

public class StackTest {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>(100);
        stack.push(5);
        arrayStack.push(5);
        long start = System.nanoTime();
        stack.pop();
        long end = System.nanoTime();
        System.out.println("linked stack takes time = " + (end - start));
        start = System.nanoTime();
        arrayStack.pop();
        end = System.nanoTime();
        System.out.println("array stack takes time = "+(end - start));
//        System.out.println(stack);
//        System.out.println("-" +stack.pop()+"-");
//        System.out.println("="+stack.top() + "=");
//        System.out.println(stack);
//        System.out.println(stack.size());
//        stack.pop();
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

    }
}
