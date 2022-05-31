package com.example.firstapp.controller;

import com.example.firstapp.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from bridgelabz";}
        @RequestMapping(value ={"/query"}, method = RequestMethod.GET)
       // public String sayHello(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname)
        //{
        //    return "Hello" + fname +  lname + "!";
        //}
        @GetMapping("/param/{name}")
    public String sayHello(@RequestParam(value = "name") String name)
    {
        return "Hello" + name + "!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";

    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName ,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello" + firstName + " " + lastName + "!";
    }

    }


