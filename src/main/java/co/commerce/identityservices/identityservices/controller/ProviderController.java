package co.commerce.identityservices.identityservices.controller;

import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable(name = "id") String value){

        if(value!=null){
            return new ResponseEntity<>("Prueba 1: ", HttpStatus.OK);
        }
        return new ResponseEntity<>(" ", HttpStatus.NOT_FOUND);
    }


    @PostMapping
    public ResponseEntity<String> post(@RequestBody String nombre){
        if(nombre.equals("1")){
            return new ResponseEntity<>(UUID.randomUUID().toString() + nombre, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(" ", HttpStatus.NOT_ACCEPTABLE);
    }

}
