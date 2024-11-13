package group.lab_06_ex_2a;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Store[] getArrayStore() {
        return arrayStore;
    }

    public void setArrayStore(Store[] arrayStore) {
        this.arrayStore = arrayStore;
    }
    private Store[] arrayStore;
    private int nbStore;

    public Company(String name) {
        this.name = name;
        this.arrayStore = new Store[10];
        this.nbStore = 0;
    }
    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore[nbStore] = store;
            nbStore++;
        } else {
            System.out.println("Cannot add more than 10 stores.");
        }
    }

    public int searchNbofStore(String productName) {
    int count = 0;
    for (int i = 0; i < nbStore; i++) {
        if (arrayStore[i] != null && arrayStore[i].searchProduct(productName)) {
            count++;
        }
    }
    return count;
}
    public void displayAll() {
        System.out.println("Stores in company " + name + ":");
        for (int i = 0; i < nbStore; i++) {
            System.out.println("- " + arrayStore[i].getName());
        }
    }
}
