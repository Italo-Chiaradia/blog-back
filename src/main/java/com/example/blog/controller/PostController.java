package com.example.blog.controller;

import com.example.blog.domain.Post;
import com.example.blog.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("posts")
@RequiredArgsConstructor
public class PostController {

    private final DateUtil dateUtil;

    @GetMapping("list")
    public List<Post> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Post("Angular 2026"), new Post("Standalone Components"));
    }
}
