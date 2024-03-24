package id.my.hendisantika.springbootappdocker;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-app-docker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/24/24
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final JdbcTemplate jdbcTemplate;

    @GetMapping
    public ResponseEntity<String> getUsers() {
        String query = "SELECT COUNT(*) FROM books";
        Integer count = jdbcTemplate.queryForObject(query, Integer.class);
        return new ResponseEntity<>("Total users: " + count, HttpStatus.OK);
    }
}
