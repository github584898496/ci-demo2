package com.example.cidemo2;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

       @GetMapping("add")
       public String add()
       {
           return "我修改下，恭喜您——user--add1!";
       }
	   
	   @GetMapping("delete")
       public String delete()
       {
           return "user--delete2!";
       }
	   
	   @GetMapping("query")
       public String query()
       {
           return "user--query3!";
       }
}
