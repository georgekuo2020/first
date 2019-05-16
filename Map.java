public class Map {
    private Box head;
    private Box tail;
    Boolean flag;

    public void insert(Box box){
        if(box==null){
            return;
        }
        /*
        Box tmp = head;
        while (true){
            if(tmp.getKey().equals(box.getKey())){
                flag=true;
                break;
            }
            tmp=tmp.next;
        }
         */
        if( tail == null) {
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        if(head == null) {
            head = box;
        }
    }
    public int size(){
        int count=0;
        if(head==null) {
            return 0;
        }
        Box tmp = head;
        while(true) {
            count++;
            if(tmp == tail) {
                break;
            }
            tmp = tmp.next;
        }
        return count;
    }
}
