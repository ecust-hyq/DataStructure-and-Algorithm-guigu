package queue;

/**
 * @auther hyq
 * @create 2021/11/12
 * @description
 */
public class ArrayQueue {
    private int maxSize;
    private int[] arrayQueue;
    private int front = -1;
    private int rear = -1;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arrayQueue = new int[maxSize];
    }

    public void add(int number) {
        front++;
        if(front == 0){
            arrayQueue[front] = number;
            rear = 0;
        }else {
            for (int i = 0; i < front-rear; i++) {
                arrayQueue[front-i] = arrayQueue[front-i-1];
            }
            arrayQueue[rear] = number;
        }
    }

    public void get(){
        if(front == -1){
            System.out.println("暂无用户");
        }else {

        }
    }
    public void printQueue(){
        for (int i = 0; i < front+1; i++) {
            System.out.print(arrayQueue[i] + "  ");
        }
    }
}
