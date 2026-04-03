package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.entity.StoryBook;
import com.test.repository.StoryBookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/storybook")
public class StoryBookController {hj

    @Autowired
    private StoryBookRepository repository;

    @PostMapping("/create")
    public Mono<StoryBook> createStoryBook(@RequestBody StoryBook book) {
        return repository.save(book);
    }

    @GetMapping("/list")
    public Flux<StoryBook> listAllStoryBooks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<StoryBook> getBookById(@PathVariable long id) {
        return repository.findById(id);
    }

    @PutMapping("/update/{id}")
    public Mono<StoryBook> updateBookById(@PathVariable long id, @RequestBody StoryBook book) {
        book.setId(id);
        return repository.save(book);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteBookById(@PathVariable long id) {
        return repository.deleteById(id);
    }
}
