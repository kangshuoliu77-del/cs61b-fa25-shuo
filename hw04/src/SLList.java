import edu.princeton.cs.algs4.In;

import javax.net.ssl.SSLContext;

public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinal;
    private int size;

    public SLList() {
        sentinal = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinal = new IntNode(63, null);
        sentinal.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinal.next = new IntNode(x, sentinal.next);
        size += 1;
    }

//    public void addLast(int x) {
//        size += 1;
//
//        if (first == null) {
//            first = new IntNode(x, null);
//            return;
//        }
//
//        IntNode p = first;
//        while (p.next != null) {
//            p = p.next;
//        }
//        p.next = new IntNode(x,null);
//    }

    public void addLast(int x) {
        size += 1;
        IntNode p = sentinal;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
//
//    public int size() {
//        return size(first);
//    }

    public int size() {
        return size;
    }

    public int getFirst() {
        return sentinal.next.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();

        System.out.println(x);
        System.out.println(L.size());
        SLList L1 = new SLList();
        L1.addLast(10);
        System.out.println(L1.getFirst());
        System.out.println(L1.size());
    }
}
