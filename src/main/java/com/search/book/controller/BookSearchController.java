package com.search.book.controller;

import com.search.book.dto.BookSearchRequest;
import com.search.book.service.BookSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookSearchController {

    private final BookSearchService bookSearchService;

    @PostMapping
    public ResponseEntity<?> getBookSearch(@Valid @RequestBody BookSearchRequest request) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookSearchService.getKakaoBookSearchResult(request));
    }

}
