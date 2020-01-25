package pl.jkan.pp5.ebook.productcatalog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Builder
@Entity
public class Book {

    private Book() {}
    @Id
    @GeneratedValue
    Long id;
    String title;
    String cover;
    String description;
    Boolean published;
    BigDecimal price;
}
