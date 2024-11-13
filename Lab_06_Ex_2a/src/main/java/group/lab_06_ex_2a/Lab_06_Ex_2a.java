package group.lab_06_ex_2a;

public class Lab_06_Ex_2a {

    public static void main(String[] args) {
        Company company = new Company("ComputerTech ");

        Store store1 = new Store("Tech1", "Karachi");
        Store store2 = new Store("Tch2", "Lahore");

        System.out.println(store1.addProduct(new Product("Laptop", 10, 10.000)));
        System.out.println(store1.addProduct(new Product("Smartphone", 20, 10000)));

        System.out.println(store2.addProduct(new Product("Tablet", 15, 50000)));
        System.out.println(store2.addProduct(new Product("Smartphone", 25, 10000)));

        company.addStore(store1);
        company.addStore(store2);

        System.out.println("Number of stores with 'Smartphone': " + company.searchNbofStore("Smartphone"));

        company.displayAll();

        System.out.println(store1.searchProduct("Smartphone"));
        System.out.println(store1.searchProduct("Tablet")); 

        System.out.println(store1.deleteProduct("Laptop"));
        System.out.println(store1.deleteProduct("Tablet")); 

        store1.displayAll();
    }
}
