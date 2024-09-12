package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
@RestController
public class Application {

    @GetMapping("/health")
    public String healthCheck() {
        return "i'm good";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Scheduled(fixedDelay = 2000)
    public void scheduleRun(){
        System.out.println("Current Scheduled Time" + new Date());
    }
}


//echo "# ci-cd" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Gnanesh26/ci-cd.git
//git push -u origin main
