public class MySinglyLinkedList <E extends Task> extends SinglyLinkedList<E > {


    public MySinglyLinkedList() {
    }




    public void completionTime() {
        Node<E> curr =  head.getNext();
        Node<E> prev = head;
        int timer = prev.getElement().getLength();
        System.out.println(prev.getElement().getName() + "," + prev.getElement().getLength());

        try {
            while (curr != null) {
                timer += curr.getElement().getLength();
                System.out.println(curr.getElement().getName() + "," + timer);
                prev = curr;
                curr = curr.getNext();

            }
        } catch (NullPointerException e) {
            System.out.print("Null pointer exception");
        }

    }


    public void insertSorted(E e) {

        if (isEmpty()) {
            head = new Node<>(e, null);
        } else {
            Node<E> start = new Node<>( e, null);
            Node<E> first = head;

            if (first.getElement().getLength() > start.getElement().getLength()) {
                start.setNext(head);
                head = start;
            } else {
                Node<E> curr =  head.getNext();
                Node<E> prev =  head;

                try{
                while (curr != null && curr.getElement().getLength() < start.getElement().getLength()) {
                    prev = curr;
                    curr = curr.getNext();
                }}catch(NullPointerException r){System.out.print("NUll");}
                prev.setNext(start);
                start.setNext(curr);
            }
        }
        size++;
    }
}




