package fr.esipe.thanuchiya.dmonlinemarketplace.service;


import fr.esipe.thanuchiya.dmonlinemarketplace.model.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    @Autowired
    ProductDto add(ProductDto product);
    void remove(String id);
    ProductDto update (String id, String name, Integer price, String description);
    ProductDto get (String id);
    List<ProductDto> getAll();
}
