package config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class CustomerController {
 
    @Autowired
    private CustomerService service;
 
    // handler methods will go here...


@RequestMapping("/")
public ModelAndView home() {
    List<Customer> listCustomer = service.listAll();
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("listCustomer", listCustomer);
    return mav;
}

@RequestMapping("/new")
public String newCustomerForm(Map<String, Object> model) {
    Customer customer = new Customer();
    model.put("customer", customer);
    return "new_customer";
}



}

