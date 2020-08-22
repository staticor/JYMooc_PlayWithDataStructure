package ch04linklist;


public class SingleLinkedList<E> {


    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }


    private Node dummyHead;
    private int size;

    public SingleLinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    // 头 插入
    public void addFirst(E e) {
        add(0, e);
    }

    // 中间 插入  较少用
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Illegal index.");
        }

        Node prev = dummyHead;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        // position of prev ->  index-1
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;

    }

    // 尾部插入
    public void addLast(E e) {
        add(size, e);
    }


    // get
    public E get(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed, Illegal index.");
        }
        Node curr = dummyHead.next;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.e;
    }

    public E getFirst(){
        return get(0);
    }

    // set
    public void set(int index, E e){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed, Illegal index.");
        }
        Node curr = dummyHead.next;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        curr.e = e;
    }

    // 查找
    public boolean contains(E e){
        Node node = dummyHead;
        while(node.next != null){
            if(node.next.equals(e)){
                return true;
            }
            node = node.next;
        }
        return false;
    }


    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed, Illegal index.");
        }
        Node prev = dummyHead;
        for(int i = 0; i < index; i ++)
            prev = prev.next;
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size -- ;
        return delNode.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
