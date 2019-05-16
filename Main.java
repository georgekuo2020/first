public class Main {

    public static void main(String[] args) {
        Box box1= new Box("A1","123");
        Map m = new Map();

        m.insert(box1);
        System.out.print(m.size());
    }
}
