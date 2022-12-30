package com.zohocrm2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
