package id.my.hendisantika.springbootappdocker.repository;

import id.my.hendisantika.springbootappdocker.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-app-docker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/24/24
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
