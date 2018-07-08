package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Customer;
import com.example.Animanga.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Customer> getAllCustomersFromController() {
        return customerService.getAllCustomersFromService();

    }


    @RequestMapping(path = "/save", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveCustomerController(@RequestBody Customer customer) {
        try {
            customerService.saveCustomerService(customer);
        } catch (Exception e) {
            System.out.println("Exception occured");
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }


    @RequestMapping(path = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Customer findCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }


    @RequestMapping(path = "/del/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteCustomerById(@PathVariable Long id) {

        try {
            customerService.deleteCustomerById(id);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/delAll", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteAllCustomers() {
        try{
            customerService.deleteAllCustomers();
        }
        catch (Exception e){
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }
}
