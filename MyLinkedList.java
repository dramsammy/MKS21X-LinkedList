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
    public Integer getData(){
      return data;
    }
    public String toString(){
      return "" + data;
    }
  }
  private int size;
  private Node start,end;
  // Empty Constructor
  public MyLinkedList(){
    start = null;
    end = null;
    size = 0;
  }
  // Returns the size of the MyLinkedList
  public int Size(){
    return size;
  }
  public boolean add(int value){
    if (size == 0){
      Node first = new Node(null, value, null);
      start = first;
      end = first;
      size++;
      return true;
    }
    if (size >= 1){
      Node latest = new Node (null, value, end);
      end.setNext(latest);
      end = latest;
      size++;
      return true;
    }
    return true;
  }
  public void clear(){
    start = null;
    end = null;
    size = 0;
  }
  private Node getNth(int x){
    Node workspace = start;
    for (int i = 0; i < x; i++){
      workspace = workspace.next();
    }
    return workspace;
  }
  public Integer get(int index){
    if (index >= size || index < 0){
      throw new IndexOutOfBoundsException("Index is not in range");
    }
    Node work = getNth(index);
    return work.getData();
  }
  public Integer set(int index, Integer v){
    if (index >= size || index < 0){
      throw new IndexOutOfBoundsException("Index is not in range");
    }
    Node work = getNth(index);
    Integer temp = work.getData();
    work.setData(v);
    return temp;
  }
  public boolean contains(Integer v){
    for (int i = 0; i < size; i++){
      if (getNth(i).getData() == v){
        return true;
      }
    }
    return false;
  }

}
