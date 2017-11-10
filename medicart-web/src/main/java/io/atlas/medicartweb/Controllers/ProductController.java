package io.atlas.medicartweb.Controllers;

import io.atlas.medicartcore.Repositories.ProductRepository;
import io.atlas.medicartcore.Services.ProductService;
import io.atlas.medicartcore.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void newProduct(@RequestBody Product p){
        productService.newProduct(p);
    }

    @RequestMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
}
