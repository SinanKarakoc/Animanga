package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Anime;
import com.example.Animanga.Service.AnimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(path = "/api/anime")
public class AnimeController {
    @Autowired
    AnimeService animeService;

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Anime> getAllAnimeFromController() {
        return animeService.getAllAnimesFromService();
    }

    @RequestMapping(path = "/find/{animeName}", method = RequestMethod.GET)
    public @ResponseBody
    Anime findAnimeByName(@PathVariable String movieName) {
        return animeService.findByMovieName(movieName);
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveAnimeController(@RequestBody Anime anime) {
        try {
            animeService.saveAnimeService(anime);
        } catch (Exception e) {
            System.out.println("Exception occured");
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/find/{animeId}", method = RequestMethod.GET)
    public @ResponseBody
    Anime findAnimeById(@PathVariable Long animeId) {
        return animeService.findAnimeById(animeId);
    }

    @RequestMapping(path = "/del/{animeId}", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteAnimeById(@PathVariable Long animeId) {

        try {
            animeService.deleteAnimeById(animeId);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/delAll", method = RequestMethod.DELETE)
    public @ResponseBody
    void deleteAllAnime() {
        animeService.deleteAllAnime();
    }


}
