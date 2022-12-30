package com.zohocrm2.services;

import java.util.List;

import com.zohocrm2.entities.Contact;
import com.zohocrm2.entities.Lead;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
