public class MyLinkedList {
  private class MyNode {
    private Integer data;
    private Node next, prev;
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
      data = i;
    }
    public String toString(){
      return "" + data;
    }
  }

  private int size;
  private Node start,end;
  public int size() {
  }
  public boolean add(int value) {

  }
  public String toString() {

  }
}
