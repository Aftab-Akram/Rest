/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.controller;

/**
 *
 * @author user
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class guest {
 @RequestMapping("/upload")
 public String welcome(Model model) {

 return "upload";
 }
 @RequestMapping("/index")
 public String index(Model model) {

 return "index";
 }
 
}
