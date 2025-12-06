package com.ecommerce_service.products.Service;

import com.ecommerce_service.products.Model.Product;
import com.ecommerce_service.products.Repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public String saveAProduct(Product product){
        productRepo.save(product);
        return "Product saved succesfully";
    }
}
