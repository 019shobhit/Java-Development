package com.app.demo.service;

import com.app.demo.model.Challenge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService {
    private final List<Challenge> challenges = new ArrayList<>();

    public ChallengeService() {
        challenges.add(new Challenge(1L, "February", "New challenge description"));
    }

    // Get all challenges
    public List<Challenge> getAllChallenges() {
        return challenges;
    }

    // Get a single challenge by ID
    public Optional<Challenge> getChallengeById(Long id) {
        return challenges.stream()
                .filter(challenge -> challenge.getId().equals(id))
                .findFirst();
    }

    // Add a new challenge
    public Challenge addChallenge(Challenge challenge) {
        challenges.add(challenge);
        return challenge;
    }

    // Update an existing challenge
    public Optional<Challenge> updateChallenge(Long id, Challenge updatedChallenge) {
        for (int i = 0; i < challenges.size(); i++) {
            if (challenges.get(i).getId().equals(id)) {
                challenges.set(i, updatedChallenge);
                return Optional.of(updatedChallenge);
            }
        }
        return Optional.empty();
    }

    // Delete a challenge by ID
    public boolean deleteChallenge(Long id) {
        return challenges.removeIf(challenge -> challenge.getId().equals(id));
    }
}
