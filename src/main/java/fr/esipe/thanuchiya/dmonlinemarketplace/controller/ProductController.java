package fr.esipe.thanuchiya.dmonlinemarketplace.controller;

import fr.esipe.thanuchiya.dmonlinemarketplace.service.IProductService;
import fr.esipe.thanuchiya.dmonlinemarketplace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class ProductController {

        @Autowired
        private IProductService productService;


        @RequestMapping(method= RequestMethod.GET, path= "/product/{id}")
        public productDto getProduct (@PathVariable("id") String id){
            return ProductService.get(id);


        }
    }

}
