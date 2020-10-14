package linked_list;

public class AddNode {

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list =  LinkedList.CreataList();
        LinkedList CleanList = list;
        AddFront(list);
    }

    // 新增list 項目
    //Case I   : At the front of the linked list
    public static void  AddFront(LinkedList List){
        LinkedList.Node AddPoint = new LinkedList.Node(9);
        AddPoint.next = List.head;
        List.head = AddPoint;
    }

    //Case II  : After a given node.
    public static void AfterNode(){

    }
    //Case III : At the end of the linked list.
    public static void IntheEnd(){

    }
}
