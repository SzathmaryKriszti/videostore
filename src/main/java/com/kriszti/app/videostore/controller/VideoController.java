package com.kriszti.app.videostore.controller;

import com.kriszti.app.videostore.dto.incoming.VideoCreationCommand;
import com.kriszti.app.videostore.service.VideoService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping
    private ResponseEntity<Void> createVideo(@RequestBody VideoCreationCommand command){
        this.videoService.createVideo(command);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
