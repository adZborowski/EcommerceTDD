package pl.jkan.pp5.ebook.productcatalog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)

public class ProductCatalogFacadeTest {

    @Test
    public void itAllowAddBookToCatalog(){
        ProductCatalogFacade api = new ProductCatalogFacade();

        Book book = thereIsBookIWouldLikeToHave();
        api.addBook(book);

        List<Book> books = api.allBooks();
        assertThat(books).hasSize(1);
    }

    private void allBooks() {
    }

    private Book thereIsBookIWouldLikeToHave() {
        return Book.builder()
                .cover("https://picsum.photos/seed/picsum/200/300")
                .title("Pragmatic Programmer")
                .description("Journey from begginer to Master")
                .published(true)
                .build();
    }
}
