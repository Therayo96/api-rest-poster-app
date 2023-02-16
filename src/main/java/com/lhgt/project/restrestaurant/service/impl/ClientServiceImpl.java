package com.lhgt.project.restrestaurant.service.impl;

import com.lhgt.project.restrestaurant.entity.Client;
import com.lhgt.project.restrestaurant.repository.ClientRepository;
import com.lhgt.project.restrestaurant.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) {
        Client existClient = clientRepository.findById(client.getId()).orElseThrow(
                () -> new NoSuchElementException("Client not found")
        );
         existClient.setName(client.getName());
         existClient.setLastname(client.getLastname());
         existClient.setPhoneNumber(client.getPhoneNumber());
         existClient.setAddress(client.getAddress());
         existClient.setEmail(client.getEmail());

         Client updateClient = clientRepository.save(existClient);

         return updateClient;
    }

    @Override
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
