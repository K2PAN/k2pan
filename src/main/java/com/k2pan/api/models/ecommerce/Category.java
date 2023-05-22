package com.k2pan.api.models.ecommerce;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "name")
    private String name;

    // , cascade =CascadeType.REFRESH, orphanRemoval = true (), fetch = FetchType.LAZY
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // public List<Product> getProducts() {
    // return products;
    // }

    // public void setProducts(List<Product> products) {
    // this.products = products;
    // }

    // public void addProduct(Product product) {
    // products.add(product);
    // product.setCategory(this);
    // }

    // public void removeProduct(Product product) {
    // products.remove(product);
    // product.setCategory(null);
    // }
}
