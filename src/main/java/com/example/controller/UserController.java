package com.example.cidemo2;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

       @GetMapping("add")
       public String add()
       {
           return "user--add!";
       }
	   
	          @GetMapping("delete")
       public String delete()
       {
           return "user--delete!";
       }
}
