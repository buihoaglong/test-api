package com.btec.webquanlybainhac.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document(collection = "products")  // Defines the MongoDB collection
public class Product {
    @Id
    private String id;

    private String name;
    private String category;
    private Date createdDate;
    private BigDecimal price;
    private String desc;

    // Constructors, Getters, Setters

    public Product() {}

    public Product(String name, String category, Date createdDate, BigDecimal price, String desc) {
        this.name = name;
        this.category = category;
        this.createdDate = createdDate;
        this.price = price;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
