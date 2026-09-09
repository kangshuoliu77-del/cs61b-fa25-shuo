
public class Stack {
    private static class IntNode {
        private int item;
        private IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public Stack() {
        sentinel = new IntNode(100, null);
        size = 0;
    }

    public void push(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;

//        IntNode p = sentinel;
//        while (p.next != null) {
//            p = p.next;
//        }
//
//        p.next = new IntNode(x, null);
    }

    public int pop() {
//        if (size != 0) {
//            size--;
//        }
        size -= 1;
        int num = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        return num;
    }

    public int size() {
        return size;
    }

    public int sum() {
        int sum = 0;
        IntNode p = sentinel.next;
        while (p != null) {
            sum += p.item;
            p = p.next;
        }
        return sum;
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(2);
        s.pop();
        s.push(10);
        System.out.println(s.size());
        System.out.println(s.sum());
    }
}
