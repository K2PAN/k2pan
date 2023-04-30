package com.k2pan.api.controllers.manager;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
@PreAuthorize("hasAnyRole('ADMIN', 'MANAGER')")
// @PreAuthorize("hasRole('MANAGER')")
public class ManagerController {

    @GetMapping("/")
    public ResponseEntity<?> managerEndpoint() {
        return ResponseEntity.ok("You have reached the manager endpoint!");
    }
}