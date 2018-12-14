public class MyLinkedList {
  private class Node {
    private Integer data;
    private Node next, prev;
    public MyNode(Integer n) {
      data = n;
      prev = null;
      next = null;
    }
    public MyNode(Integer n, Node next1; Node prev1) {
      data = n;
      next = next1;
      prev = prev1;
    }
    public Node next() {
      return next;
    }
    public Node prev() {
      return prev;
    }
    public void setNext(Node other) {
      next = other;
    }
    public void setPrev(Node other) {
      prev = other;
    }
    public Integer getData() {
      return data;
    }
    public Integer setData(Integer i) {
      Integer temp = data;
      data = i;
      return data;
    }
    public String toString(){
      return "" + data;
    }
  }

  private int size;
  private Node start,end;
  public MyLinkedList() {
    size = 0;
    start = null;
    end = null;
  }

  public int size() {
    return size;
  }

  public boolean add(int value) {
    if (size = 0) {
      start = new Node(value);
      end = start;  private Node start,end;
    }
    else {
      add = new Node(value, null, end)
      end.setNext(add);
      end = add;
    }
    size += 1;
    return true;
  }

  public boolean contains(Integer value) {
    Node current = start;
    while (current != null) {
      if (current.getData() == value) {
        return true;
      }
      current = current.next();
    }
    return false;
  }

  public void add(int index, Integer value) {
    if (index < 0) {
      throw new NullPointerException("Invalid index");
    }

    Node current = start;
    for (int i = 0; i < index; i++) {
      current = current.next();
    }
    try {
      Node n = new Node(value, current, current.prev());
      current.prev().setNext(n);
      current.setPrev(n);

    }catch (NullPointerException e) {
      print ("Invalid index");
    }
  }

  public String toString() {
    String str = "";
    Node current = start;
    while (current != null) {
      str += current.getData();
      current = current.next();
    }
    return str;
  }
}
