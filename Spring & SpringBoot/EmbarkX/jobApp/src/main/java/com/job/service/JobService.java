package com.job.service;

import com.job.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    private List<Job> jobs = new ArrayList<>();


    public List<Job> getAllJobs(){
        return jobs;
    }
    public Job addJob(Job job) {
        jobs.add(job);
        return job;
    }

    public Job updateJob(int id, Job updatedJob) {
        for(int i=0;i<jobs.size();i++){
            if(jobs.get(i).getId() == id){
                jobs.set(i,updatedJob);
                return updatedJob;
            }
        }
        return null;
    }
}
