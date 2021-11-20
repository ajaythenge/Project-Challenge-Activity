import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class LinkedProb
{
    static Scanner sc = new Scanner(System.in);
    Node head;

    void insert(int data)
    {
        Node tempNode = new Node(data);
        if(head == null)
            head = tempNode;
        else
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = tempNode;
        }
    }

    Node swapNodes()
    {
        Node temp = head;
        Node nextNode = temp.next;
        while (temp != null && temp.next != null)
        {
            int local = temp.data;
            temp.data = nextNode.data;
            nextNode.data = local;
            temp = nextNode.next;
            temp = temp.next;
        }
        return temp;
    }
    void print()
    {
        Node temp = head;
        System.out.print("[");
        while (temp.next != null)
        {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print(temp.data+"]");
    }

    public static void main(String[] args)
    {
        LinkedProb list = new LinkedProb();
        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        str = str.replaceAll("\\[|\\]","");
        String[] sArr =str.split(", ");
        int[] intarray = new int[sArr.length];

        for(int i=0; i<intarray.length; i++)
            intarray[i] = Integer.parseInt(sArr[i]);


        for (int j : intarray)
            list.insert(j);


        list.swapNodes();
        list.print();


        //    String str="[1, 2, 3, 4]";
        //    String str="[1]";
        //    String str="[]";
        //    String str="[5, 4, 3, 2, 1]";


    }
}import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class LinkedProb
{
    static Scanner sc = new Scanner(System.in);
    Node head;

    void insert(int data)
    {
        Node tempNode = new Node(data);
        if(head == null)
            head = tempNode;
        else
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = tempNode;
        }
    }

    Node swapNodes()
    {
        Node temp = head;
        Node nextNode = temp.next;
        while (temp != null && temp.next != null)
        {
            int local = temp.data;
            temp.data = nextNode.data;
            nextNode.data = local;
            temp = nextNode.next;
            temp = temp.next;
        }
        return temp;
    }
    void print()
    {
        Node temp = head;
        System.out.print("[");
        while (temp.next != null)
        {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print(temp.data+"]");
    }

    public static void main(String[] args)
    {
        LinkedProb list = new LinkedProb();
        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        str = str.replaceAll("\\[|\\]","");
        String[] sArr =str.split(", ");
        int[] intarray = new int[sArr.length];

        for(int i=0; i<intarray.length; i++)
            intarray[i] = Integer.parseInt(sArr[i]);


        for (int j : intarray)
            list.insert(j);


        list.swapNodes();
        list.print();


        //    String str="[1, 2, 3, 4]";
        //    String str="[1]";
        //    String str="[]";
        //    String str="[5, 4, 3, 2, 1]";


    }
}