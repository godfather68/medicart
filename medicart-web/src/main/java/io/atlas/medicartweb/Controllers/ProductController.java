//package io.atlas.medicartweb.Controllers;
//
//import io.atlas.medicartcore.Repositories.ProductRepository;
//import io.atlas.medicartcore.entities.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//public class ProductController {
//
//    @Autowired
//    private ProductRepository productRepository;
//    private String msg = "Data Center";
//
//    @RequestMapping("/products")
//    public String getMsg(){
//        return this.msg;
//    }
//
//    @RequestMapping("/add")
//    public @ResponseBody
//    String newProduct(@RequestParam String name, @RequestParam String desc){
//
//        Product p = new Product();
//        p.setName(name);
//        p.setDescription(desc);
//        productRepository.save(p);
//        return "saved successfully !";
//    }
//
//    @RequestMapping("/all")
//    public @ResponseBody Iterable<Product> getAllProducts(){
//        return productRepository.findAll();
//    }
//}
