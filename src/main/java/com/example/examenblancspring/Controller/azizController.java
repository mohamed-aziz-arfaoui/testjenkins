package com.example.examenblancspring.Controller;

import com.example.examenblancspring.Entities.aziz;
import com.example.examenblancspring.Services.azizService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class azizController {
   @Autowired
   azizService as;

   @PostMapping("/ajoutperso")
   @ResponseBody

   public aziz ajouterpersonne(@RequestBody aziz a) {
      return as.ajouterperso(a);

   }
}
