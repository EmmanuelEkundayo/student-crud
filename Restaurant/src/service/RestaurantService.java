package service;

public interface RestaurantService {

    String provideMenu();

    String registerACustomer(String name, int age, String country, String location);
}
