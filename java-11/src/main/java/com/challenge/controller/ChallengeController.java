package com.challenge.controller;

import com.challenge.entity.Challenge;
import com.challenge.service.interfaces.ChallengeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/challenge")
public class ChallengeController {

    @Autowired
    private ChallengeServiceInterface challengeService;

    @GetMapping
    public ResponseEntity<List<Challenge>> findById(
            @RequestParam(name = "accelerationId") Long accelerationId,
            @RequestParam(name = "userId") Long userId) {
        return ResponseEntity.ok((this.challengeService.findByAccelerationIdAndUserId(accelerationId, userId)));
    }
}
