package com.app.demo;

import java.util.ArrayList;
import java.util.List;

public class ChallengeController {
    private List<Challenge> challanges = new ArrayList<>();

    public List<Challenge> getAllChallenges(){
        return this.challanges;
        
    }
}
