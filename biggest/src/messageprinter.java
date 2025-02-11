public class messageprinter {
    public void printmessage(String name) {
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
        messageprinter m = new messageprinter();
        m.printmessage("Geek");
    }
}