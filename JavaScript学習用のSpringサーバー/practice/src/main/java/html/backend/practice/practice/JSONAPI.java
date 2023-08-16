package html.backend.practice.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONAPI {
  @GetMapping("/")
  Record DefaultPass(){
    return new Record("ゴリラ", "0001");
  }
  
}
record Record(String Name,String ID){};
