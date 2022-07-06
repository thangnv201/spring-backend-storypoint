package com.bosch.storypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.storypoint.model.StoryPoint;
import com.bosch.storypoint.service.StoryPointService;

@RestController
public class StoryPointController {

    @Autowired
    private StoryPointService pointService;

    @GetMapping("/all")
    public List<StoryPoint> getAll() {
        return pointService.list();
    }

    @PostMapping("/insert")
    public StoryPoint inseStoryPoint(@RequestBody StoryPoint storyPoint) {
        return pointService.insert(storyPoint);
    }
}
