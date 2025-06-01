package com.dago.journalApp.controller;

import com.dago.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntry = new HashMap<>();

    @GetMapping()
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntry.values());
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getById(@PathVariable long myId){
        return journalEntry.get(myId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntry.put(myEntry.getId(),myEntry);
        return true;
    }

}
