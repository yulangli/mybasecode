package facetest;

public class ListNode {
    private int val;
    private ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
    public static ListNode Merge(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode mergeNode = null;
        ListNode current = null;
        while (list1 !=null && list2 !=null){
            if (list1.val <= list2.val){
                if (mergeNode==null){
                    mergeNode=current=list1;

                }else {
                    current.next =list1;
                    current =current.next;
                }
                list1 = list1.next;
            }else {
                if(mergeNode==null){
                    mergeNode = current=list2;
                }else {
                    current.next =list2;
                    current =current.next;
                }
                list2 =list2.next;
            }
        }
        if(list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }
        return mergeNode;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        ListNode r1 = new ListNode(4);
        ListNode r2 = new ListNode(5);
        ListNode r3 = new ListNode(6);
        ListNode r4 = new ListNode(7);
        r1.next=r2;
        r2.next=r3;
        r3.next=r4;

        ListNode merged = new ListNode(-1);
        merged = Merge(l1, r1);
        while (merged!=null) {
            System.out.println(merged.val);
            merged=merged.next;

        }

    }
}
