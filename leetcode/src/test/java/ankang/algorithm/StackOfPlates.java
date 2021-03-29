package ankang.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StackOfPlates {

    private final List<LinkedList<Integer>> stack;

    private final int cap;

    public StackOfPlates(int cap) {
        // 在此处写入代码
        this.cap = cap;
        this.stack = new ArrayList<>();
    }

    public void push(int val) {
        // 在此处写入代码
        if (stack.isEmpty() || stack.get(stack.size() - 1).size() == cap) {
            stack.add(new LinkedList<>());
        }

        final LinkedList<Integer> integers = stack.get(stack.size() - 1);
        new Random().nextBoolean()
        integers.addLast(val);
    }

    public int pop() {
        // 在此处写入代码
        if (stack.isEmpty() ) {
            return -1;
        }

        final LinkedList<Integer> integers = stack.get(stack.size() - 1);
        if (integers.isEmpty()){
            stack.remove(integers);
            return pop();
        }

       return integers.removeLast();
    }

    public int popAt(int index) {
        // 在此处写入代码
        if (index <0||index>=stack.size()){
            return -1;
        }

        final LinkedList<Integer> integers = stack.get(index);

        if (integers.isEmpty()){
            stack.remove(integers);
            return popAt(index);
        }

        return integers.removeLast();
    }

}