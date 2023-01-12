package javaproject.projectjava.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tweet")
public class TweetController {

    PostForm obj = new PostForm();

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Object> getTweets() {
        return obj.getTweet();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void setTweet(@RequestBody Object tweet) {
        System.out.println(tweet);
        obj.setTweet(tweet);
    }
        
}
