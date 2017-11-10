package io.atlas.medicartcore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    private String name;
    private String description;
//    private ProductStatus status;
//    private Category category;
//    private Date added_on = new Date();
//    private Integer count;

    public Product(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
//        this.status = status;
//        this.category = category;
//        this.added_on = added_on;
//        this.count++;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public ProductStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus() {
//        if(this.count == null)
//            this.status = ProductStatus.IN_STOCK;
//        else
//            this.status = ProductStatus.OUT_OF_STOCK;
//    }
//
//    public Category getCatagory() {
//        return category;
//    }
//
//    public void setCatagory(Category catagory) {
//        this.category = catagory;
//    }
//
//    public Date getAdded_on() {
//        return added_on;
//    }
//
//    public void setAdded_on(Date added_on) {
//        this.added_on = added_on;
//    }
}
