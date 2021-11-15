package LinkedList;

/**
 * @auther hyq
 * @create 2021/11/15
 * @description 单向列表（增删改查）
 * 要点：
 * 1.每个节点至少要包含一个数据属性和一个节点属性（记录下一个节点）
 * 2.链表类要具有头节点属性和尾节点属性
 * 3.头节点属性可记录数据也可单纯作为一个空的节点，尾节点记录最后一个数据节点
 * 4.添加数据的要点是要创建一个临时结点记录当前的尾节点，尾节点则记录添加的新数据节点，
 *   并将新的尾节点赋给前一个尾节点即临时节点的next属性。
 * 5.这里的临时节点并不会释放内存，因为并非创建了一个新的类，而是将新的类变量指向了尾节点内存地址。
 * 6.注意：链表的创建并非是前面所有节点看成一个完整的对象，应当着眼于每一个节点对象，每一个节点对象都记录了下一个节点对象信息，
 *   因此，只要索引到一个节点（头节点）就能索引到后面每个节点。
 */
public class SingleLinkedList<T> {
    private Node first;
    private Node last;
    private int sum = 0;

    public SingleLinkedList(){}

    private class Node {
        T data;
        Node next;
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    //添加元素（增）
    public void add(T data) {
        sum++;
        if(first == null){
            first = new Node(data, null);
            last = first;
        }else {
            Node l = last;
            Node newNode = new Node(data, null);
            last = newNode;
            l.next = newNode;
        }
    }

    //查（包括查询列表长度、全部元素、指定索引元素、第一个元素以及最后一个元素）
    public int getLength(){
        return sum;
    }

    public void showList(){
        System.out.print("当前单向列表的所有元素为：[");
        Node n = first;
        while (n.next != null){
            System.out.print(n.data + "  ");
            n = n.next;
        }
        System.out.print(n.data);
        System.out.println("]");
    }

    public T get(int index){
        if(index>=0 && index<sum){
            Node f = first;
            for (int i = 0; i < index; i++) {
                f = f.next;
            }
            return f.data;
        }else {
            throw new RuntimeException("当前索引不存在");
        }
    }

    public T getFirst(){
        return first.data;
    }

    public T getLast(){
        return last.data;
    }

    //删除指定索引元素
    public boolean remove(int index){
        if(index>=0 && index<sum){
            sum--;
            if(index == 0){
                first = first.next;
            }else {
                Node removeFront = first;
                for (int i = 0; i < index-1; i++) {
                    removeFront = removeFront.next;
                }
                removeFront.next = removeFront.next.next;
            }
            return true;
        }
        else {
            System.out.println("删除失败，无当前索引元素");
            return false;
        }
    }

    //改变指定索引位置元素
    public boolean change(int index, T data){
        if(index>=0 && index<sum){
            Node c = first;
            for (int i = 0; i < index; i++) {
                c = c.next;
            }
            c.data = data;
            return true;
        }else {
            return false;
        }
    }
}
