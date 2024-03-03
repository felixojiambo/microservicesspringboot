package felix.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(value="products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
public  String id;
public String name;
private  String description;
private BigDecimal price;

}

