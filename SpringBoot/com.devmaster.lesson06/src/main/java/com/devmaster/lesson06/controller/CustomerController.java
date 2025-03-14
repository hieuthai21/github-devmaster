package com.devmaster.lesson06.controller;

import com.devmaster.lesson06.dto.CustomerDTO;
import com.devmaster.lesson06.enity.Customer;
import com.devmaster.lesson06.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    // Constructor Injection (Tốt hơn @Autowired trực tiếp trên biến)
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Lấy danh sách khách hàng
    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers/customer-list";
    }

    // Hiển thị form thêm khách hàng mới
    @GetMapping("/add-new")
    public String addNewCustomer(Model model) {
        model.addAttribute("customer", new CustomerDTO()); // Sử dụng DTO
        return "customers/customer-add";
    }

    // Xử lý thêm khách hàng mới
    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return "redirect:/customers";
    }

    // Hiển thị form chỉnh sửa khách hàng
    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model) {
        CustomerDTO customer = customerService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Khách hàng không tồn tại với ID: " + id));

        model.addAttribute("customer", customer);
        return "customers/customer-edit";
    }

    // Xử lý cập nhật khách hàng
    @PostMapping("/update/{id}")
    public String updateCustomer(@PathVariable Long id, @ModelAttribute("customer") CustomerDTO customerDTO) {
        customerService.updateCustomerById(id, customerDTO);
        return "redirect:/customers";
    }

    // Xóa khách hàng
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
}
