package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class SpringController {
 
 @RequestMapping("/")
 public String welcome() {
 return "Welcome to Spring Boot Tutorials";
 }
 
 @RequestMapping("/hello")
 public String myData() {
 return "Hello Spring Boot";
 }
}
