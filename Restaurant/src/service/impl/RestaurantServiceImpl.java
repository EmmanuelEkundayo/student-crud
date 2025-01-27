package service.impl;

import model.Customer;
import service.RestaurantService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestaurantServiceImpl implements RestaurantService {

    private static  final List<String> AVAILABLE_DISHES = List.of("jollof Rice", "Amala");
    private static final List<Customer> registeredCustomers = new ArrayList<>();
    @Override
    public String provideMenu() {
        String welcomeMessage = "Welcome to our restaurant, We offer the following : \n";
        return  welcomeMessage.concat(String.join(",",AVAILABLE_DISHES));
    }

    @Override
    public String registerACustomer(String name, int age, String country, String location) {
        return null;
    }
}
