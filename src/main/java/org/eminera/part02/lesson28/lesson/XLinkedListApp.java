package org.eminera.part02.lesson28.lesson;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList list = new XLinkedList();

    for (int i = 0; i < 7; i++) {
      list.append(new XLinkedList.Node(i + 10));
    }

    list.showNodesAndCount();
    list.delete(2);
    list.showNodesAndCount();


  }
}