package com.example.service;

import java.util.List;

import com.example.model.ContactMessage;

public interface ContactMessageService {

    ContactMessage saveMessage(ContactMessage message);

    List<ContactMessage> getAllContactMessages();
}