package com.br.sfb.crcjud.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Products
 */
@Document(collection = "products")
public class Products {

    @Id
    String id;
    String prodName;
    String prodDesc;
    Double prodPrice;
    String prodImage;
      
}