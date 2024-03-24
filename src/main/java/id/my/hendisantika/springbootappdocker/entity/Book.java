package id.my.hendisantika.springbootappdocker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-app-docker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/24/24
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
}
