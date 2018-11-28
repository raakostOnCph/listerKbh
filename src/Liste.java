public class Liste {


    Node head = null;
    Node tail = null;

    public void insertFromHead(Node n) {

        processNode(n);


    }


    public void insertFromHead(String s) {

        Node n = new Node(s);

        processNode(n);


    }

    private void processNode(Node n) {
        if (head == null) {

            head = tail = n;
        } else {

            n.next = head;
            head.previous = n;
            head = n;

        }
    }

    public void insertFromTail(String s) {

        Node n = new Node(s);

        if (head == null) {
            head = tail = n;
        } else {

            tail.next = n;
            n.previous = tail;
            tail = n;
        }


    }


    public String printfromHead() {

        String res = "";

        Node n = head;

        while (n != null) {

            res += n.data + "\n";
            n = n.next;
        }


        return res;

    }


    public String printFromTail() {

        String res = "";

        Node n = tail;

        while (n != null) {

            res += n.data + "\n";
            n = n.previous;
        }


        return res;

    }

    public Node findNode(String s) {

        Node res = new Node("findes ikke");

        Node n = head;

        while (n != null) {

            if (n.data.equalsIgnoreCase(s)) {
                res = n;
                break;
            }
            n = n.next;
        }


        return res;


    }


    public Node deleteNode(String s) {

        Node n = findNode(s);

        // vi laver slet fra head og selt fra tail

        if (n == head) {
           return deleteHead();

        }
        if (n == tail) {
            return deleteTail();

        }

        if (n.data.equalsIgnoreCase("findes ikke")) {
            return null;
        }

        Node res = n;

        n.previous.next = n.next;
        n.next.previous = n.previous;

        return res;

    }

    public Node deleteHead() {

        Node res = head;

        head.next.previous = null;
        head = head.next;

        return res;

    }

    public Node deleteTail() {

        Node res = tail;

        tail.previous.next = null;
        tail = tail.previous;
        return res;

    }


    public void insertbefore(String s, String nyKnude) {

        Node newNode = new Node(nyKnude);

        Node n = findNode(s);
        if (n.data.equalsIgnoreCase("findes ikke") ) {
            return;
        }

        n.previous.next = newNode;
        newNode.next = n;
        n.previous = newNode;
        newNode.previous = n.previous;


    }
}

