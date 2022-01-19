package Excersises;

public class p86a_Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books() myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The grapes of Java.";
        myBooks[1].title = "The Java gatsby.";
        myBooks[2].title = "The Java cookbook.";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "anne";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.printl(myBooks[x].author);
            x = x -1;
        }
    }
}
