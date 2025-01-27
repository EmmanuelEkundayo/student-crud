import service.RestaurantService;
import service.impl.RestaurantServiceImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantServiceImpl();

        System.err.println(service.provideMenu());
    }

}