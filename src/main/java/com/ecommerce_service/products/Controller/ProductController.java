package com.ecommerce_service.products.Controller;

import com.ecommerce_service.products.Model.Product;
import com.ecommerce_service.products.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/save")
    public String saveAProduct(@RequestBody Product product){
        return productService.saveAProduct(product);
    }
}
