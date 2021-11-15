package LinkedList;

/**
 * @auther hyq
 * @create 2021/11/15
 * @description 单链表
 * 尚硅谷的单链表头节点不记录信息，无尾节点属性，尾节点通过遍历获取。与我写的单链表有较大不同，故在这里的按尚硅谷的方法重写一次单链表
 */
public class SingleLinkedList_guigu<T> {
    private int sum;
    private Node head;

    public SingleLinkedList_guigu(){
        this.head = new Node(null, null);
    }

    private class Node{
        private T data;
        private Node next;
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }


}
