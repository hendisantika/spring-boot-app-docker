package id.my.hendisantika.springbootappdocker;

import id.my.hendisantika.springbootappdocker.entity.Book;
import id.my.hendisantika.springbootappdocker.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAppDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppDockerApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(BookRepository bookRepository) throws Exception {
        return (args) -> {
            bookRepository.save(new Book(1L, "Belajar Java", "HENDI SANTIKA"));
            bookRepository.save(new Book(2L, "Belajar Spring Boot", "HENDI SANTIKA"));
            bookRepository.save(new Book(3L, "Belajar NuxtJS", "HENDI SANTIKA"));
            bookRepository.save(new Book(4L, "Belajar Laravel", "HENDI SANTIKA"));
            bookRepository.save(new Book(5L, "Belajar AngularJS", "HENDI SANTIKA"));
        };
    }
}
