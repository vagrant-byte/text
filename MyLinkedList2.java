class LastNode {
    public int date;
    public LastNode next;
    public LastNode(int date) {
        this.date=date;
    }
}
public class MyLinkedList2 {
    LastNode head=null;
    //头插
    public void addFirst(int date) {
        LastNode node=new LastNode(date);
        node.next=head;
        head=node;
    }
    //尾插
    public void addLast(int date) {
        LastNode node=new LastNode(date);
        LastNode cur=this.head;
        if(this.head==null) {
            head=node;
        } else {
            //找尾
            while (cur.next!=null) {
                cur=cur.next;
            }
            cur.next=node;
            cur=node;
        }
    }
    //找前一个节点
    public LastNode findIndexSubOne(int index) {
       LastNode cur=this.head;
        while (index!=0) {
           cur=cur.next;
           index--;
       }
        return cur;
    }
    //任意位置插入
    public void addIndex(int index,int date) {
        LastNode node=new LastNode(date);
        if(index<0||index>size()) {
            System.out.println("插入位置不合法");
            return;
        }
        if(index==0) {
            addFirst(date);
            return;
        }
        if(index==size()) {
            addLast(date);
            return;
        }
        LastNode cur=findIndexSubOne(index-1);
        node.next=cur.next;
        cur.next=node;
    }
    //找是否包含关键字key
    public boolean contains(int key) {
        LastNode cur=this.head;
        while (cur!=null) {
            if(cur.date==key) {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找key 的前一个节点
    public LastNode searchPrev(int key) {
        LastNode prev=this.head;
        while (prev.next!=null) {
            if(prev.next.date==key) {
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    //删除第一次出现关键字key的节点
    public void remove(int key) {
        if(this.head.date==key) {
            this.head=this.head.next;
            return;
        }
        LastNode prev=searchPrev(key);
        if(prev==null) {
            System.out.print("没有要删除的节点");
        } else {
            prev.next=prev.next.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        LastNode prev=this.head;
        LastNode cur=this.head.next;
        while (cur!=null) {
            if(cur.date==key) {
                prev.next=cur.next;
                cur=cur.next;
            } else {
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.date==key) {
            this.head=this.head.next;
        }
    }
    //链表长度
    public int size() {
        LastNode cur=this.head;
        int count=0;
        while (cur!=null) {
            count++;
            cur=cur.next;
        }
        return count;
    }
    //打印链表
    public void display() {
        LastNode cur=this.head;
        while (cur!=null) {
            System.out.print(cur.date+" ");
            cur=cur.next;
        }
    }
    //清空链表
    public void clear() {
        this.head=null;
    }
    public LastNode 
}
