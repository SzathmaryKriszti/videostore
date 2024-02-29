package com.kriszti.app.videostore.service;

import com.kriszti.app.videostore.domain.Video;
import com.kriszti.app.videostore.dto.incoming.VideoCreationCommand;
import com.kriszti.app.videostore.repository.VideoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VideoService {

    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video createVideo(VideoCreationCommand command) {
        return videoRepository.save(new Video(command));
    }
}
