
package group.lab_06_ex_03;


public class Lab_06_Ex_03 {

    public static void main(String[] args) {
       
     
        Library lib = new Library("Karachi Library");

        lib.addBranch("Gulshan");
        lib.addBranch("Johar");

        LB GulshanBranch = lib.getBranch("Gulshan");
        if (GulshanBranch != null) {
            GulshanBranch.addBook(new Book("The Computer", "Javeed", "123456789"));
            GulshanBranch.addBook(new Book("The Killer", "John", "987654321"));

            GulshanBranch.displayBooks();

            GulshanBranch.removeBook("123456789");

            GulshanBranch.displayBooks();
        }

        lib.displayAllBranches();
    }
}

    

