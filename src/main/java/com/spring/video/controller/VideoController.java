package com.spring.video.controller;

import com.spring.video.mapper.VideoMapper;
import com.spring.video.model.Video;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author hamza.ahmed 15/10/19
 * Rest controller for creating api for video insert and get
 */

@RestController
@RequestMapping(value= "/video")
public class VideoController {
    @Resource
    VideoMapper videoMapper;


    /**
     *
     * @return simple message
     */
    @GetMapping(value = "/")
    public  String msg(){
        return "Hello from video Controller";
    }

    /**
     *
     * @return list of all vidoes saved in database
     */
    @GetMapping("/getallvideos")
    public ArrayList<Video> getAllProducts(){


        return videoMapper.getAll();
    }

    /**
     *
     * @param video will take the values from the request body
     * @return will return the object to the mapper for inserting video in database
     */
    @RequestMapping(value = "/insertvideo",method = RequestMethod.POST)
        public int insertProduct(@RequestBody Video video){
        return videoMapper.insert(video);
    }



}
