package com.example.demo.productGroup;

import javax.persistence.*;

@Entity
@Table(name = "product_group")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer groupId;
    private String name;
    private String description;

    public ProductGroup() {}

    public ProductGroup(Integer groupId, String name, String description) {
        this.groupId = groupId;
        this.name = name;
        this.description = description;
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

    public Integer getProductGroupId() {
        return groupId;
    }

    public void setProductGroupId(Integer id) {
        this.groupId = groupId;
    }
}
