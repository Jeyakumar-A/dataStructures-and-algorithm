package llqans;



public class ReorderList {

    



    public void reOrderList(ListNode head){
        
        
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;

        }
        if(hf!=null){
            hf.next=null;
        }

    }

    private ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }

        return prev;
    }

    private ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    
        
    public static void main(String[] args) {
        
        ReorderList list=new ReorderList();
        for (int i=5;i>0;i--){
        list.add(i);
        }
        list.reOrderList(list.head);
           list.display(list.head); 

        
        
         }

           
   private void display(ListNode head) {
    ListNode temp=head;
    while(temp!=null){
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    System.out.println("END");
    
    }


public ListNode head;
   public  ListNode tail;
    public  void add(int i) {
       ListNode node=new ListNode(i);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        
    }

    
}
