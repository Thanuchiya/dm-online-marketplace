package fr.esipe.thanuchiya.dmonlinemarketplace.service;

import fr.esipe.thanuchiya.dmonlinemarketplace.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);
    void remove(Product product);
    void update (String id);
    Product get (String id);
    List<Product> get.All();
}
