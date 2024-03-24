package id.my.hendisantika.springbootappdocker.controller;

import id.my.hendisantika.springbootappdocker.entity.Book;
import id.my.hendisantika.springbootappdocker.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@Repository
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> all = bookRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
