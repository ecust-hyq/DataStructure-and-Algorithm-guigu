package LinkedList;

/**
 * @author HYQ
 * @description
 * @creat 2021--11--15--22:50
 */
public class SingleLinkedList_guigu_Test {
    public static void main(String[] args) {
        SingleLinkedList_guigu<String> myList = new SingleLinkedList_guigu<>();
        System.out.println("按顺序添加至队尾");
        myList.add(1, "Tom");
        myList.add(5, "Jack");
        myList.add(4, "Marry");
        myList.add(6, "Linda");
        myList.showList();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        System.out.println("按ID顺序添加");
        SingleLinkedList_guigu<String> myList2 = new SingleLinkedList_guigu<>();
        myList2.addById(1, "Tom");
        myList2.addById(5, "Jack");
        myList2.addById(4, "Marry");
        myList2.addById(6, "Linda");
        myList2.addById(6, "Linda");
        myList2.showList();
    }
}
