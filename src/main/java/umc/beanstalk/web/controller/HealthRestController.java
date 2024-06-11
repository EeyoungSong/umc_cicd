package umc.beanstalk.web.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthRestController {

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("healthy!!!");
    }

    @GetMapping("/")
    public ResponseEntity<String> health2(){return ResponseEntity.ok("healthy2!!!");}

}
