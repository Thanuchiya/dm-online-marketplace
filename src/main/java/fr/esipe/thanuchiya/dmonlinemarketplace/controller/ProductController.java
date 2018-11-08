package fr.esipe.thanuchiya.dmonlinemarketplace.controller;

import fr.esipe.thanuchiya.dmonlinemarketplace.model.ProductDto;
import fr.esipe.thanuchiya.dmonlinemarketplace.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    public class ProductController {
        @Autowired
        private IProductService productService;


        @RequestMapping(method= RequestMethod.GET, path= "/product/{id}")
        public ProductDto getProduct (@PathVariable("id") String id){
            return productService.get(id);
        }


        @RequestMapping(method=RequestMethod.GET, path="/product")
        public List<ProductDto> all(){
            return productService.getAll();
    }


    @RequestMapping(method=RequestMethod.GET, path="/product/mod/{id}")
    public ProductDto mod(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("price") Integer price, @RequestParam("description") String description){
        return productService.update(id, name, price, description);
    }


    @RequestMapping(method=RequestMethod.GET, path="/product/erase/{id}")
    public String erase(@PathVariable("id") String id){
            productService.remove(id);
            return "Produit Supprimé";
    }


    @RequestMapping(method = RequestMethod.GET, path="/product/create/{id}")
    public ProductDto create(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("price") Integer price, @RequestParam("description") String description){
            return productService.add(ProductDto.builder().id(id).name(name).description(description).price(price).build());
    }

}
