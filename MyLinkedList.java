public class MyLinkedList{
  private class Node{
    private int data;
    private Node next,prev;
    // Empty Constructor
    public Node(int Number){
    
    }
    public Node(Node ReferenceFrom, int Number, Node ReferenceTo){
      next = ReferenceTo;
      prev = ReferenceFrom;

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
