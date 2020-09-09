package vextorsAndStacks;

import java.util.Stack;
import java.util.Vector;

public class MainClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
//        s.is

        s.push(12);
        s.push(13);
        int elem = s.pop();
        System.out.println(elem+ " " + s.peek());
    }
}
