package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepo;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")//pure class per mapping laga dena
public class JunoralCOntrollerHandlerv2 {

    private Map<Long, JournalEntry> journalentries = new HashMap<>();

    @Autowired
    JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll()
    {
        return journalEntryService.getAll();
    }

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/checkDb")
    public String CheckMongo(){
        return mongoTemplate.getDb().getName();
    }


    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry)
    {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @PutMapping("id/{myId}")
    public JournalEntry updateEntry(@PathVariable long myId, @RequestBody JournalEntry myEntry)
    {
        return null;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId)
    {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId)
    {

        return null;
    }

    @GetMapping("/test")
    public String test()
    {
        return "Hey i have been called";
    }


}
