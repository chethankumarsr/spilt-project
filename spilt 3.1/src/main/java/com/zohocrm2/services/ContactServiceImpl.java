package com.zohocrm2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.entities.Contact;
import com.zohocrm2.repositories.ContactRepository;

@Service   // it is a stereotype----->it helps to define service layer in springboot project & maintained by springFramework
public class ContactServiceImpl implements ContactService {

	@Autowired     // to save the contact, here autowired.
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contact> getAllContacts() {
	List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
	  Optional<Contact> findById = contactRepo.findById(id);
	  Contact contact =findById.get();
		return contact;
	}

}
