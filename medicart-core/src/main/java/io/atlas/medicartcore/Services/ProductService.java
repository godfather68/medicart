package io.atlas.medicartcore.Services;

import io.atlas.medicartcore.Repositories.ProductRepository;
import io.atlas.medicartcore.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        // return list of all products

//        List<Product> products = new ArrayList<>();
//        productRepository.findAll().forEach(products::add);
        return (ArrayList<Product>) productRepository.findAll();
    }

    public Product getProduct(Long id){
        // return product with specific ID

        return productRepository.findOne(id);
    }

    public void newProduct(Product p){
        // saving a new product
        productRepository.save(p);
    }

//    public void updateProduct(Long id, Product p){
//        // retrieve specific product with ID , then update it
//    }
//
//    public void deleteProduct(Long id){
//        // delete specific product
//    }
}
