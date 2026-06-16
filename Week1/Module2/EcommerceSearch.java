package Week1.Module2;


class Product{
    int productId;
    String productName;
    String category;

    Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + category);
    }
}
public class EcommerceSearch {
    public  static Product productLinearSearch(Product [] products, int target){
       for(Product product:products){
        if(product.productId==target){
            return product;
        }
       }
       return null;
    }
    public static Product productBinarySearch(Product [] products, int target){
        int left=0;
        int right=products.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(products[mid].productId==target){
                return products[mid];
            }
            else if(products[mid].productId<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return null;
    }


    public static void main(String [] args){
        Product[] products={
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };
        int searchId = 104;

        System.out.println("Linear Search:");

        Product result1 = productLinearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = productBinarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }

    }
}
