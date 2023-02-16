package com.lhgt.project.restrestaurant.controller;


import com.lhgt.project.restrestaurant.entity.Client;
import com.lhgt.project.restrestaurant.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/client")
public class ClientController {



     private ClientService clientService;


     @PostMapping
     public ResponseEntity<Client> createClient(@RequestBody Client client){
          Client saveClient = clientService.createClient(client);
          return new ResponseEntity<>(saveClient,HttpStatus.CREATED);
     }

     @GetMapping
     public ResponseEntity<List<Client>> getAllClients(){
          List<Client> clients = clientService.getAllClients();
          return new ResponseEntity<>(clients, HttpStatus.OK);
     }
}
