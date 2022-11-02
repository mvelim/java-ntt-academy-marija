package org.javacourse;

import org.javacourse.db.ConnectionPool;
import org.javacourse.dto.Customer;
import org.javacourse.repository.CustomerRepository;
import org.javacourse.service.CustomerService;
import org.javacourse.service.MotorcycleService;
import org.javacourse.service.WarrantyService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DealershipService
{
    public static void main( String[] args ){
        ConnectionPool pool = new ConnectionPool();

        CustomerRepository customerRepo = new CustomerRepository(pool);
        CustomerService customerService = new CustomerService(customerRepo);
        MotorcycleService motorcycleService = new MotorcycleService();
        WarrantyService warrantyService = new WarrantyService();

        Scanner sc = new Scanner(System.in);
        System.out.println("Dealership Store");
        System.out.println("Choose your option");
        System.out.println("Option 1: Customer Service");
        System.out.println("Option 2: Motorcycle service");
        System.out.println("Option 3: Warranty service");

        String entryValue = sc.nextLine();
        if (entryValue.equals("1")) {
            System.out.println("Customer Service: ");
            System.out.println("Option 1: List of customers");
            System.out.println("Option 2: Register new customer");
            System.out.println("Option 3: Update customer");
            System.out.println("Option 4: Delete customer");
            String entryValue2 = sc.nextLine();
            switch (entryValue2) {
                case "1":
                    List<Customer> customers = customerService.getAll();
                    for(int i = 0; i < customers.size(); i++) {
                        Customer current = customers.get(i);
                        System.out.printf("NAME: %s  PHONE: %s  SSN: %s \n",
                                current.getName(),
                                current.getPhoneNumber(),
                                current.getSsn());
                    }
                    break;
                case "2":
                    System.out.println("Enter full name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter social security number: ");
                    String ssn = sc.nextLine();
                    customerService.registerCustomer(name, phoneNumber, ssn);
                    System.out.println("Successfully added " + name + " to the registry");
                    break;
                case "3":
//                    System.out.println("Choose a customer to update: \n");
//                    List<Customer> customer = customerService.getCustomerList();
//                    for (int i = 0; i < customer.size(); i++) {
//                        System.out.println(i + 1 + ". " + customer.get(i));
//                    }
//                    System.out.println("Select customer to update: ");
//                    String name1 = sc.nextLine();
//                    for (int i = 0; i < customer.size(); i++) {
//                        if (entryValue2.equals(customer.get(i).getName())) {
//
//                            break;
//                        }
//                    }
            }
        }
             else if (entryValue.equals("2")) {
                System.out.println("Motorcycle service: ");
                System.out.println("Option 1: List of motorcycles");
                System.out.println("Option 2: Add new motorcycle");
                System.out.println("Option 3: Update mileage");
                System.out.println("Option 4: Mark vehicle as stolen");
            } else if (entryValue.equals("3")) {
                System.out.println("Warranty service: ");
                System.out.println("Option 1: List of warranties");
                System.out.println("Option 2: Create warranty");
                System.out.println("Option 3: Extend warranty");
                System.out.println("Option 4: Warranty info");
            }else if (entryValue.equals("4")) {
//                System.out.println("Choose a customer to update: \n");
//                List<Customer> customer = customerService.getCustomerList();
//                    for (int i = 0; i < customer.size(); i++) {
//                    System.out.println(i + 1 + ". " + customer.get(i));
//                    }
//                String entryValue2 = sc.nextLine();
//                System.out.println("Select customer to delete: ");
//                for (int i = 0; i < customer.size(); i++) {
//                    if (entryValue2.equals(customer.get(i).getName())) {
//                        customer.remove(customer.get(i));
//                        break;
//                }
 //           }
        }
    }
}
