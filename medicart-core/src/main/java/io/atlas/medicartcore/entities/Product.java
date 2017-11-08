package io.atlas.medicartcore.entities;

import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private ProductStatus status;
    private Category catagory;
    private Date added_on = new Date();
    private Integer count;

    public Product(Integer id, String name, String description, ProductStatus status, Category catagory, Date added_on) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.catagory = catagory;
        this.added_on = added_on;
        this.count++;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus() {
        if(this.count == null)
            this.status = ProductStatus.IN_STOCK;
        else
            this.status = ProductStatus.OUT_OF_STOCK;
    }

    public Category getCatagory() {
        return catagory;
    }

    public void setCatagory(Category catagory) {
        this.catagory = catagory;
    }

    public Date getAdded_on() {
        return added_on;
    }

    public void setAdded_on(Date added_on) {
        this.added_on = added_on;
    }
}
