package com.sungsik.springbootdeveloper.service;

import com.sungsik.springbootdeveloper.domain.Article;
import com.sungsik.springbootdeveloper.dto.AddArticleRequest;
import com.sungsik.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
    public List<Article> findAll(){ return blogRepository.findAll(); }
}
