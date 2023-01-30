package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node node = new Node();
        node.value = value;

        if (first.next == null && last.prev == null){
            last.prev = node;
            first.next = node;
        }
        else{
            Node preLast = last.prev;
            preLast.next = node;
            last.prev = node;
            node.prev = preLast;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
