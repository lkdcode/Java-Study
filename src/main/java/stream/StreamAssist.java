package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));

        List<String> customerNames = customers.stream()
          .filter(customer -> customer.getAge() > 30)
          .sorted()
          .map(Customer::getName)
          .collect(Collectors.toList());

        System.out.println(customerNames);

//        List<Customer> list = new ArrayList<>();
//        for (Customer customer : customers) {
//            if (customer.getAge() > 30) {
//                list.add(customer);
//            }
//        }
//
//        Collections.sort(list);
//
//        List<String> results = new ArrayList<>();
//        for (Customer customer : list) {
//            results.add(customer.getName());
//        }
//
//        for (String name : results) {
//            System.out.println(name);
//        }


    }

}
