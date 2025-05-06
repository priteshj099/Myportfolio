package com.example.controller;


import com.example.model.ContactMessage;
import com.example.service.ContactMessageService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // allow from all origins
public class ContactController {

    @Autowired
    private ContactMessageService messageService;

    @PostMapping
    public ContactMessage receiveMessage(@RequestBody ContactMessage message) {
        return messageService.saveMessage(message);
    }
    @GetMapping
    public List<ContactMessage> getAllContactMessages() {
        return messageService.getAllContactMessages();
    }
    
}