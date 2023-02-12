public class Book implements Printable {
    String name;

    public Book(String Name){
        name = Name;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + name);
    }

    public static void printBook (Printable[] printable){
        for (Printable printables : printable){
            if (printables instanceof Book){
                printables.print();
            }
        }
    }
}
