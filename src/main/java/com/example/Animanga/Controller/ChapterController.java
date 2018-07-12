package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Chapter;
import com.example.Animanga.Service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(path = "/api/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;


    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Chapter> getAllChapters() {
        return chapterService.getAllChapters();
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveChapter(@RequestBody Chapter chapter) {
        try {
            chapterService.saveChapter(chapter);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/del", method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus deleteChapter(@RequestBody Chapter chapter) {
        try {
            chapterService.deleteChapter(chapter);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;

        }
        return HttpStatus.OK;
    }

}
