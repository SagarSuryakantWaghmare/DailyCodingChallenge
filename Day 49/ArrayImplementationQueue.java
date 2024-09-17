
public class ArrayImplementationQueue {
    public static class QueueArray{
       int front=-1;
       int rear=-1;
       int size=0;
       int []arr=new int[5];
       public void add(int val){
        if(front==-1){
            //queue is currently empty 
            front=rear=0;
            arr[0]=val;
            size++;
        }
        else if(size==arr.length){
            System.out.println("Queue is overflow");
        }
        else{
            arr[++rear]=val;
            size++;
        }
       }
       public int remove(){
        if(size==0){
            System.out.println("Queue is underflow");
            return -1;
        }
        int x=arr[front++];
        size--;
        return x;
       }
       public int peek(){
        if(size==0){
            System.out.println("Queue is underflow");
            return -1;
        }
        return arr[front];
       }
       public boolean isEmpty(){
        if(size==0) return true;
        else return false;
       }
       public boolean isFull(){
        if(size==arr.length) return true;
        else return false;
       }
       public void display(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
      // 1 2 3 4 5
        // Starting form we get an array and the put the rear and front

        // imp point:we don't remove the elements in the array we simply move the front
        // forward
        // it is like window
        QueueArray q=new QueueArray();
        q.display();
        q.add(5);
        q.add(6);
        q.add(2);
        q.add(8);
        q.add(10);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
