//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//@RestController
//@RequestMapping("/_journal")//pure class per mapping laga dena
//public class JunoralCOntrollerHandler {
//
//    private Map<Long, JournalEntry> journalentries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll()
//    {
//        return new ArrayList<>(journalentries.values());
//    }
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry)
//    {
////        @RequestBody -> its like saying "hey spring, please take the data from the request and turn into a java object
////        that i can use in my code.
//        journalentries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//    @PutMapping("id/{myId}")
//    public JournalEntry updateEntry(@PathVariable long myId, @RequestBody JournalEntry myEntry)
//    {
//        return journalentries.put(myId,myEntry);
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getEntryById(@PathVariable Long myId)
//    {
//            return journalentries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntryById(@PathVariable Long myId)
//    {
//        return journalentries.get(myId);
//    }
//
//
//}
