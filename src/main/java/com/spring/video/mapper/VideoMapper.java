package com.spring.video.mapper;


import com.spring.video.model.Video;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author hamza.ahmed 15/10/19
 * MyBatis mapper for crud operations in database
 */


@Mapper
public interface VideoMapper {
    //get all videos list
    @Select("SELECT * from videos")
    ArrayList<Video> getAll();

    //insert new video
    @Insert("insert into videos (name, video_source) "+
            "values(#{name},#{videoSource})")
    public int insert(Video video);






}
