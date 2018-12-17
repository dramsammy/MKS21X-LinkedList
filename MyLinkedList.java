public class MyLinkedList{
  private class Node{
    private int data;
    private Node next,prev;
    public Node(Node ReferenceFrom, int Number, Node ReferenceTo){
      next = ReferenceTo;
      prev = ReferenceFrom;
      data = Number;
    }
    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    public void setNext(Node other){
      next = other;
    }
    public void setPrev(Node other){
      prev = other;
    }
    public Integer setData(Integer other){
      Integer temp = data;
      data = other;
      return temp;
    }
  }
  private int size;
  private Node start,end;
  // Empty Constructor
  public MyLinkedList(){
  }
  // Returns the size of the MyLinkedList
  public int Size(){
    return size;
  }
  public boolean add(int value){
    return true;
  }

}
