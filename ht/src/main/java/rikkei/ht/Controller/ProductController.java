package rikkei.ht.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rikkei.ht.Entities.Product;
import rikkei.ht.Services.ProductService;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Product> product = productService.getAllProduct();
        model.addAttribute("product", product);
        return "index";
    }

    @RequestMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @GetMapping(value = "/edit")
    public String editProduct(@RequestParam("id") int productId, Model model) {
        Optional<Product> productEdit = productService.getProductById(productId);
        productEdit.ifPresent(product -> model.addAttribute("product", product));
        return "editProduct";
    }

    @PostMapping(value = "/save")
    public String save(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping(value = "delete")
    public String deleteProduct(@RequestParam("id") int productId, Model model) {
        productService.deleteProduct(productId);
        return "redirect:/";
    }
}
