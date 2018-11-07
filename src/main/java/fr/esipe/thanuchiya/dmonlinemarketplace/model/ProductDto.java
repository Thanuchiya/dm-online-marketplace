package fr.esipe.thanuchiya.dmonlinemarketplace.model;

import lombok.Builder;

import java.util.List;

/**
 * @author  Thanuchiya THANANCHEYAN
 */
public class Product {

	/**
	 * Reference of the product
	 */
	private String id;
	private String name;
	private String urlImage;
	/**
	 * Price in cents
	 */
	private Integer price;
	private  String description;
	private List<String> componentDescriptions;


	@Builder
	public ProductDto () {

	}

	private Product (String id){
		this.id=id;
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getComponentDescriptions() {
		return componentDescriptions;
	}

	public void setComponentDescriptions(List<String> componentDescriptions) {
		this.componentDescriptions = componentDescriptions;
	}
}
}
