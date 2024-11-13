package group.lab_06_ex_2a;

import java.util.ArrayList;

public class Store {
    private String name;
    private String location;
    private ArrayList<Product> productList;
    private int nbProduct;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new ArrayList<>();
        this.nbProduct = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public String addProduct(Product p) {
        for (Product prod : productList) {
            if (prod.getName().equals(p.getName())) {
                prod.setQuantity(prod.getQuantity() + p.getQuantity()); 
                return p.getName() + " already exists. Quantity updated to " + prod.getQuantity() + " in " + this.name;
            }
        }
        if (nbProduct < 100) {
            productList.add(p);
            nbProduct++;
            return p.getName() + " has been added to " + this.name;
        } else {
            return "Cannot add more than 100 products to " + this.name;
        }
    }

    public boolean searchProduct(String productName) {
        for (Product p : productList) {
            if (p.getName().equals(productName)) {
                return true; 
            }
        }
        return false; 
    }

    public String deleteProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getName().equals(productName)) {
                productList.remove(i);  
                nbProduct--;
                return productName + " has been removed from " + this.name;
            }
        }
        return "Product " + productName + " not found in " + this.name;
    }

    public void displayAll() {
        System.out.println("Products in store " + name + ":");
        for (Product p : productList) {
            System.out.println("- " + p.getName() + " (Quantity: " + p.getQuantity() + ", Price:Rs" + p.getPrice() + ")");
        }
    }
}
