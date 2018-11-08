package fr.esipe.thanuchiya.dmonlinemarketplace.service;

import fr.esipe.thanuchiya.dmonlinemarketplace.model.ProductDto;
import fr.esipe.thanuchiya.dmonlinemarketplace.repository.ProductRepositoryMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  implements IProductService{
    @Autowired
    private ProductRepositoryMock productRepository;

    @Override
    public ProductDto add(ProductDto product) {
        return productRepository.save(product);
    }

    @Override
    public void remove(String id) {
        productRepository.delete(get(id));
    }

    @Override
    public ProductDto update(String id, String name, Integer price, String description) {
        ProductDto prod = get(id);
        prod.setName(name);
        prod.setPrice(price);
        prod.setDescription(description);
        return prod;
    }

    @Override
    public ProductDto get(String id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductDto> getAll() {
        return ((List<ProductDto>) productRepository.findAll());
    }
}

