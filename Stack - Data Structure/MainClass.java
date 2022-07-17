public class MainClass {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(50);
        s1.push(20);
        s1.push(10);
        s1.push(5);
        s1.push(2);
        System.out.println(s1.isEmpty());
        s1.show();
        // s1.peek();
    }    
}