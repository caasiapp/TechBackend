package com.example.elbackendo.controllers;


import com.example.elbackendo.models.Post;
import com.example.elbackendo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RequestController {

    @Autowired
    PostRepository postRepo;

    @PostMapping("/addPost")
    public HttpStatus addPost(@RequestBody Map<String,String> req) {

        String name = req.get("name");
        String postDescription = req.get("postDescription");
        String postDate = req.get("postDate");
        System.out.println(name + postDescription + postDate);

    
    Post post = new Post(name,postDescription,postDate);

    if (post == null) {
        return HttpStatus.BAD_REQUEST;
    }

     postRepo.save(post);
        return HttpStatus.OK;
    }


}
