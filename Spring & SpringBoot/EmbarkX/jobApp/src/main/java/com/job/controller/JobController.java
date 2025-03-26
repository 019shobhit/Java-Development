package com.job.controller;

import com.job.model.Job;
import com.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping()
    private List<Job> allJobs(){
        return jobService.getAllJobs();
    }

    @PostMapping()
    private ResponseEntity<Job> addJob(@RequestBody Job job){
        Job tempJob = jobService.addJob(job);
        return ResponseEntity.status(201).body(tempJob);
    }

    @PutMapping("/{id}")
    private ResponseEntity<Job> updateJob(@PathVariable int id,@RequestBody Job updatedJob){
        Job job = jobService.updateJob(id,updatedJob);
        return job != null ? ResponseEntity.ok(job):ResponseEntity.notFound().build();
    }



}
