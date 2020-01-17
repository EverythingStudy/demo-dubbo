package com.example.service;

import org.springframework.web.servlet.function.ServerResponse;

public interface TestService {
    public ServerResponse send(Mail mail);
}
