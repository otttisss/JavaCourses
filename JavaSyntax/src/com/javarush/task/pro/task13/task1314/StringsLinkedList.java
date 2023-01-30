package com.javarush.task.pro.task13.task1314;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //напишите тут ваш код
        Node next = first.next;
        if (index < 0)
            return null;
        for (int i = 0; i < index; i++) {
            if (next == null || next.next == null)
                return null;
            next = next.next;
        }
        return next.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
