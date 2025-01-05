package com.prasad.devops.controller;

import com.prasad.devops.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HomeController
{
    @GetMapping("/home/{name}")
    public ResponseEntity<Message> homeApi(@PathVariable String name)
    {
        Message message=new Message(HttpStatus.OK.value(), "Hello "+name+", Jenkins CI/CD launched successfully");
        return ResponseEntity.ok(message);
    }
}
