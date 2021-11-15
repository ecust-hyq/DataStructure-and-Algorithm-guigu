package LinkedList;

/**
 * @auther hyq
 * @create 2021/11/15
 * @description
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> mylist = new SingleLinkedList<>();

        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);

        System.out.println("当前列表长度为：" + mylist.getLength());
        mylist.showList();
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(2));
        System.out.println("first data:" + mylist.getFirst());
        System.out.println("last data:" + mylist.getLast());

        System.out.println("删除成功？：" + mylist.remove(0));
        mylist.showList();

        System.out.println("改变成功？：" + mylist.change(3, 10));
        mylist.showList();

        SingleLinkedList<Character> mylist2 = new SingleLinkedList<>();
        mylist2.add('a');
        mylist2.add('b');
        mylist2.showList();
    }
}
