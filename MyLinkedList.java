public class MyLinkedList {
  private class Node {
    private Integer data;
    private Node next, prev;
    public Node(Integer n) {
      if (data == null) {
        throw new NullPointerException();
      }
      data = n;
      prev = null;
      next = null;
    }
    public Node(Integer n, Node next1, Node prev1) {
      if (data == null) {
        throw new NullPointerException();
      }
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
    if (size == 0) {
      start = new Node(value);
      end = start;
    }
    else {
      Node add = new Node(value, null, end);
      end.setNext(add);
      end = add;
    }
    size += 1;
    return true;
  }

  public Integer get(int index) {
    Node current = start;
    for (int i = 0; i <= index; i++) {
      current = current.next();
    }
    if (index < 0 || current.getData() == null) {
      throw new NullPointerException("Invalid index");
    }
    return current.getData();
  }

  public Integer set(int index, Integer value) {
    Node current = start;
    for (int i = 0; i <= index; i++) {
      current = current.next();
    }
    if (index < 0 || current.getData() == null) {
      throw new NullPointerException("Invalid index");
    }
    Integer temp = current.getData();
    current.setData(value);
    return temp;
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
    Node current = start;
    for (int i = 0; i < index; i++) {
      current = current.next();
    }
    if (index < 0 || current.getData() == null) {
      throw new NullPointerException("Invalid index");
    }
      Node n = new Node(value, current, current.prev());
      current.prev().setNext(n);
      current.setPrev(n);
      size += 1;
  }

  public Integer remove(int index) {
    Node current = start;
    for (int i = 0; i <= index; i++) {
      current = current.next();
    }
    if (index < 0 || current.getData() == null) {
      throw new NullPointerException("Invalid index");
    }
    Node n = current.next();
    Node p = current.prev();
    n.setPrev(p);
    p.setNext(n);
    size -= 1;
    return current.getData();
  }

  public boolean remove(Integer value) {
    Node current = start;
    while (current != null) {
      if (current.getData() == value) {
        Node n = current.next();
        Node p = current.prev();
        n.setPrev(p);
        p.setNext(n);
        size -= 1;
        return true;
      }
      current = current.next();
    }
    return false;
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
