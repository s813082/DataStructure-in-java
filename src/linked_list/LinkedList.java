package linked_list;


public class LinkedList {
    Node head; // head of list

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        LinkedList list = CreataList();
        printlist(list);
    }

    // 創造一個新的list
    public static LinkedList CreataList(){
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        /* Three nodes have been allocated dynamically.
          We have references to these three blocks as head,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

        llist.head.next = second; // Link first node with the second node

        /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        second.next = third; // Link second node with the third node

        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

        third.next = fourth;
        return llist;
    }

    // 印出所有list 項目
//    public void printlist(){
//
//        Node n = head;
//        // 判斷是否有下一個項目
//        while (n!= null){
//            System.out.println(n.data);
//            n = n.next;
//        }
//
//    }

    public static void printlist(LinkedList list){

//        Node n = new head;
        while(list.head.next != null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }
    }

}
