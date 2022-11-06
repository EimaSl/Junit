package day1106.warmup;

public class ProductService {

    /**
     * Sukurti metoda, kuris sukurtu visu produktu esanciu masyve kaina
     */
    public Double calculateTotalProductPrice(Product[] products) {
        double total = 0;
        for (Product product: products) {
            if (product.price > 0 && product.quantity > 0) {
                total += product.price * product.quantity;
            }
        }
        return total;
    }
}
