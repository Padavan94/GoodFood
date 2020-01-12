package com.example.demo.product;

import com.example.demo.productGroup.ProductGroup;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String name;
    private Long protein;
    private Long carbohydrates;
    private Long fats;
    private String description;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private ProductGroup productGroup;
    private Integer waterPercentage;
    private String image;

    public Product() {}

    public Product(Integer id, String name, Long protein, Long carbohydrates, Long fats, String description, ProductGroup productGroup, Integer waterPercentage, String image) {
        this.id = id;
        this.name = name;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.description = description;
        this.productGroup = productGroup;
        this.waterPercentage = waterPercentage;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProtein() {
        return protein;
    }

    public void setProtein(Long protein) {
        this.protein = protein;
    }

    public Long getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Long carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Long getFats() {
        return fats;
    }

    public void setFats(Long fats) {
        this.fats = fats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductGroup getGroup() {
        return productGroup;
    }

    public void setGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public Integer getWaterPercentage() {
        return waterPercentage;
    }

    public void setWaterPercentage(Integer waterPercentage) {
        this.waterPercentage = waterPercentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
