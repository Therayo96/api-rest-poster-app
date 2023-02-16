package com.lhgt.project.restrestaurant.service;

import com.lhgt.project.restrestaurant.entity.Client;

import java.util.List;

public interface ClientService {

    Client createClient(Client client);

    Client getClientById(Long clientId);

    List<Client> getAllClients();

    Client updateClient(Client client);

    void deleteClient(Long clientId);

}
