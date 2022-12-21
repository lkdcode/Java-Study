package functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalAssist {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);
        List<Customer> result = new ArrayList<>();

        // 요구사항 1) 지역으로 검색
//        List<Customer> result = service.searchCustomerByLocation("Seoul");
//
//        for (Customer customer : result) {
//            System.out.println(customer);
//        }

        // 요구사항 2) 성별로 검색
//        List<Customer> result = service.searchCustomerByGender(Gender.Female);
//
//        for (Customer customer : result) {
//            System.out.println(customer);
//        }

//        List<Customer> result = service.searchCustomerBy(SearchOption.Location, "Busan");
//
//        for (Customer customer : result) {
//            System.out.println(customer);
//        }

        result = service.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {
//                if (customer.getLocation().equals("Seoul")) {
//                    return true;
//                } else {
//                    return false;
//                }

                if (customer.getGender().equals(Gender.Male)) {
                    return true;
                } else {
                    return false;
                }
            }
        });



        for (Customer customer : result) {
            System.out.println(customer);
        }

    }


    private static void initData(CustomerService service) {
        service.addCustomer(new Customer("CUS01", "Seoul", Gender.Male, 30));
        service.addCustomer(new Customer("CUS02", "Busan", Gender.Female, 55));
        service.addCustomer(new Customer("CUS03", "Seoul", Gender.Male, 13));
        service.addCustomer(new Customer("CUS04", "Gwangju", Gender.Female, 27));
        service.addCustomer(new Customer("CUS05", "Gwangju", Gender.Male, 61));
        service.addCustomer(new Customer("CUS06", "Incheon", Gender.Female, 29));
        service.addCustomer(new Customer("CUS07", "Seoul", Gender.Male, 42));
        service.addCustomer(new Customer("CUS08", "Seoul", Gender.Male, 45));
        service.addCustomer(new Customer("CUS09", "Seoul", Gender.Female, 33));
        service.addCustomer(new Customer("CUS10", "Busan", Gender.Male, 20));
    }
}
