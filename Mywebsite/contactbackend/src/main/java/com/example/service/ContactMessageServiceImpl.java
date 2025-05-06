package com.example.service;

import com.example.model.ContactMessage;
import com.example.repository.ContactMessageRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageServiceImpl implements ContactMessageService {

    @Autowired
    private ContactMessageRepository repository;

    @Override
    public ContactMessage saveMessage(ContactMessage message) {
        return repository.save(message);
    }

    public List<ContactMessage> getAllContactMessages() {
        return repository.findAll();
    }
}