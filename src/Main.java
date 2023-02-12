public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер и Кубок огня");
        Book book2 = new Book("Серебрянные глаза");
        Book book3 = new Book("Лисья нора");
        Magazine magazine1 = new Magazine("Glamour");
        Magazine magazine2 = new Magazine("People");
        Magazine magazine3 = new Magazine("Good Housekeeping");

        Printable[] printable;
        printable = new Printable[]{book1, book2, book3, magazine1, magazine2, magazine3};
        for(Printable printables : printable){
            printables.print();
        }

        System.out.println();
        Magazine.printMagazine(printable);

        System.out.println();
        Book.printBook(printable);
    }
}