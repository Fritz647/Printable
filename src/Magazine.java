public class Magazine implements Printable{

    String name;

    public Magazine(String Name){
        name = Name;
    }
    @Override
    public void print() {
        System.out.println("Printing magazine " + name);
    }

    public static void printMagazine(Printable[] printable){
        for (Printable pritables : printable){
            if (pritables instanceof Magazine){
                pritables.print();
            }
        }
    }
}
