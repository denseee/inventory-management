package com.inventory.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inventory.entity.Product;
import com.inventory.service.DepartmentService;
import com.inventory.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;
    private final DepartmentService departmentService;

    public ProductController(ProductService productService,
                             DepartmentService departmentService) {
        this.productService = productService;
        this.departmentService = departmentService;
    }


 // LIST + SEARCH
    @GetMapping
    public String list(
            @RequestParam(required = false) String keyword,Model model) {

        if (keyword != null && !keyword.isBlank()) {
            model.addAttribute("products", productService.search(keyword));
        } else {
            model.addAttribute("products", productService.findAll());
        }

        model.addAttribute("keyword", keyword);
        return "products";
    }

    // ADD FORM
    @GetMapping("/new")
    public String addForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("departments", departmentService.getAll());
        return "product-form";
    }

    // SAVE
    @PostMapping("/save")
    public String save(
            @ModelAttribute Product product,
            @RequestParam Long departmentId,
            RedirectAttributes redirectAttributes) {

        boolean isEdit = product.getId() != null;

        product.setDepartment(
            departmentService.getById(departmentId)
        );

        productService.save(product);

        redirectAttributes.addFlashAttribute(
            "successMessage",
            isEdit ? "Product updated successfully"
                   : "Product added successfully"
        );

        return "redirect:/products";
    }

    // EDIT FORM
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("departments", departmentService.getAll());
        return "product-form";
    }

    
    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable Long id,
            RedirectAttributes redirectAttributes) {

        productService.deleteById(id);

        redirectAttributes.addFlashAttribute(
            "successMessage",
            "Product deleted successfully"
        );

        return "redirect:/products";
    }

    
    //SEARCH
    @GetMapping("/search")
    public String search(@RequestParam(required = false) String keyword, Model model) {

        System.out.println(">>> SEARCH keyword = [" + keyword + "]");

        List<Product> products;

        if (keyword != null && !keyword.isBlank()) {
            products = productService.search(keyword);
        } else {
            products = productService.findAll();
        }

        System.out.println(">>> RESULTS COUNT = " + products.size());

        model.addAttribute("products", products);
        model.addAttribute("keyword", keyword);

        return "search-products";
    }


}
