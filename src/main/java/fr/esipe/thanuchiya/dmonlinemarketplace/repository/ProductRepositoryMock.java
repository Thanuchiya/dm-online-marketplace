package fr.esipe.thanuchiya.dmonlinemarketplace.repository;

import fr.esipe.thanuchiya.dmonlinemarketplace.model.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryMock {

    public static final List<ProductDto> productsMock;

    static {
        productsMock = new ArrayList<>();
        productsMock.add(ProductDto.builder().id("toto").name("toto").build());
    }


    public <S extends ProductDto> S save(S s) {
        productsMock.add(s);
        return s;
    }

    public ProductDto findById(String s) {
        for(ProductDto p : productsMock){
            if(p.getId().equals(s)){
                return p;
            }
        }
        return null;
    }

    public Iterable<ProductDto> findAll() {
        return productsMock;
    }

    public void delete(ProductDto prod) {
        productsMock.remove(prod);
    }
}
