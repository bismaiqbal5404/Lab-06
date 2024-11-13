
package group.lab_06_ex_03;

import java.util.ArrayList;
import java.util.List;


public class LB {
   
    private String branchName;
    private List<Book> books;

    public LB(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to " + branchName + ": " + book.getTitle());
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                System.out.println("Book with ISBN " + isbn + " removed from " + branchName);
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in " + branchName);
    }

    public void displayBooks() {
        System.out.println("Books in " + branchName + ":");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}

