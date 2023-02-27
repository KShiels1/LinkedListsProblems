public class Main extends Task {

    public static void main(String[] args) {
        MySinglyLinkedList <Task> list2= new MySinglyLinkedList<>();
        DoublyLinkedList<Task> dlist= new DoublyLinkedList<>();


        Task t1= new Task("T1",20);
        Task t2= new Task("T2",5);
        Task t3= new Task("T3",25);
        Task t4= new Task("T4",30);
        Task t5= new Task("T5",10);
        Task t6= new Task("T6",15);

        list2.insertSorted(t1);
        list2.insertSorted(t2);
        list2.insertSorted(t3);
        list2.insertSorted(t4);
        list2.insertSorted(t5);
        list2.insertSorted(t6);
        list2.Print();
        System.out.println();
        list2.completionTime();

        System.out.println();


        dlist.insertSorted(t1);
        dlist.insertSorted(t2);
        dlist.insertSorted(t3);
        dlist.insertSorted(t4);
        dlist.insertSorted(t5);
        dlist.insertSorted(t6);

        dlist.Print();





















    }



}