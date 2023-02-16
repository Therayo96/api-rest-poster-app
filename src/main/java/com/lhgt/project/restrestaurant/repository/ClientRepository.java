package com.lhgt.project.restrestaurant.repository;

import com.lhgt.project.restrestaurant.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
