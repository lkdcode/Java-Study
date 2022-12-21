package functional;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        this.customers.add(newCustomer);
    }

    // 요구 사항 1) 지역으로 검색
    public List<Customer> searchCustomerByLocation(String location) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getLocation().equals(location)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    // 요구 사항 2) 지역으로 검색
    public List<Customer> searchCustomerByGender(Gender gender) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getGender().equals(gender)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    // 하나의 메소드로 ... 처리


    public List<Customer> searchCustomerBy(SearchOption searchOption, String searchValue) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (searchOption.equals(SearchOption.Location)) {
                if (customer.getLocation().equals(searchValue)) {
                    foundCustomers.add(customer);
                }
            }

            if (searchOption.equals(SearchOption.Gender)) {
                if (customer.getGender().name().equals(searchValue)) {
                    foundCustomers.add(customer);
                }
            }

        }
        return foundCustomers;
    }

    // interface 를 통한 검색 메소드
    public List<Customer> searchCustomers(SearchFilter filter) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (filter.isMatched(customer))
                foundCustomers.add(customer);
        }

        return foundCustomers;
    }

}
