package LinkedList;


/**
 * @auther hyq
 * @create 2021/11/15
 * @description 单链表
 * 尚硅谷的单链表头节点不记录信息，无尾节点属性，尾节点通过遍历获取。与我写的单链表有较大不同，故在这里的按尚硅谷的方法重写一次单链表
 * 尚硅谷课程还介绍了一种按索引大小顺序添加的单链表，故这里给单链表加入编号属性
 */
public class SingleLinkedList_guigu<T> {
    private int sum = 0;
    private Node head;

    public SingleLinkedList_guigu(){
        this.head = new Node(-1, null, null);
    }

    private class Node{
        private T data;
        private Node next;
        private int id;
        private Node(int id, T data, Node next){
            this.id = id;
            this.data = data;
            this.next = next;
        }
    }

    public void add(int id, T data){
        sum++;
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new Node(id, data, null);
    }

    //根据Id从小大到大的顺序添加至链表，如果ID已存在则提示添加失败
    public void addById(int id, T data){
        sum++;
        Node insert = head;
        while (true){
            if(insert.next!=null && id < insert.next.id){
                Node i = insert.next;
                insert.next = new Node(id, data, i);
                break;
            }else if(insert.next == null){
                insert.next = new Node(id, data, null);
                break;
            }else if(id == insert.next.id){
                System.out.printf("当前ID:%d已存在，（ID: %d, name: %s） 添加失败！\n", id, id, data);
                break;
            }else {
                insert = insert.next;
            }
        }
    }

    public void showList(){
        System.out.println("当前列表：");
        Node n = head;
        if(head.next == null){
            System.out.println("当前列表为空");
        }else {
            while (n.next != null){
                n = n.next;
                System.out.println("ID: " + n.id + "\tname: " + n.data);
            }
        }

    }

    public Node getHead(){
        return head;
    }

    //腾讯面试题:单链表的反转
    public void reversal(){
        Node last = head;
        Node temp;
        Node h = head;
        Node t;
        if(head.next != null && head.next.next!= null){
            for (int i = 0; i < sum-1; i++) {
                last = head;

                while (last.next.next != null){
                    last = last.next;
                }
                temp = last.next;
                last.next = null;
                t = h.next;
                h.next = temp;
                temp.next = t;
                h = temp;
            }
        }
    }

}
