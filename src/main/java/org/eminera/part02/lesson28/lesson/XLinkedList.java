package org.eminera.part02.lesson28.lesson;

public class XLinkedList {

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    @Override
    public String toString() {
      return String.format("Node[data=%d] ---> ", data);
    }
  }

  Node head;

  public XLinkedList() {
    super();
  }

  public XLinkedList(Node head) {
    this.head = head;
  }

  void append(Node nextNode) {
    if (head == null) head = nextNode;
    else {
      Node temp = head;
      while (temp.next != null) temp = temp.next;
      temp.next = nextNode;
    }
  }

  void showNodesAndCount() {
    if (head == null) System.out.println("list is empty!");
    else {
      Node temp = head;
      int size = 0;
      while (temp.next != null) {
        System.out.print(temp);
        size++;
        temp = temp.next;
      }
      System.out.println("NULL\nSize of list: " + size);
    }
  }

  void delete(int index) {
    if (head == null) System.out.println("List is empty!");
    else {
      Node prev = head;
      Node curr = head;
      while (index-- != 0) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = curr.next;
    }
  }
}
