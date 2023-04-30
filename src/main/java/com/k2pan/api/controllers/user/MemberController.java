package com.k2pan.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@PreAuthorize("hasAnyRole('ADMIN', 'MANAGER', 'MEMBER')")
public class MemberController {

    @GetMapping("/")
    public ResponseEntity<?> memberEndpoint() {
        return ResponseEntity.ok("You have reached the member endpoint!");
    }
}