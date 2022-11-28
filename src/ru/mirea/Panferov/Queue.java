package ru.mirea.Panferov;

public class Queue {

    private int[] arr;
    private int rear, front;

    public Queue(int size) {
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public boolean isFull(){
        return front == 0 && rear == arr.length - 1;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public void enqueue(int x) {
        try {
            if (isFull()) throw new QueueFull("Очередь переполнена, удалите элемент!");
            if (front == -1) front = 0;
            rear++;
            arr[rear] = x;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int dequeue(){
        int elem;
        try{
            if (isEmpty()) throw new QueueEmpty("Очередь пуста, добавьте элемент!");
            elem = arr[front];
            if (front >= rear){
                front = -1;
                rear = -1;
            }
            else front++;
            return elem;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void display(){
        try{
            if (isEmpty()) throw new QueueEmpty("Очередь пуста!");
            for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


