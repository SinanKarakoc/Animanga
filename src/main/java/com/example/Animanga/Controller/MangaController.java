package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Manga;
import com.example.Animanga.Service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(path = "api/manga")
public class MangaController {
    @Autowired
    MangaService mangaService;

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Manga> getAllMangasFromController() {

        return mangaService.getAllMangasFromService();
    }

    @RequestMapping(path = "/find/{mangaName}", method = RequestMethod.GET)
    public @ResponseBody
    Manga findMangaByName(@PathVariable String mangaName) {
        return mangaService.findMangaByName(mangaName);
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveMangaController(@RequestBody Manga manga) {
        try {
            mangaService.saveMangaService(manga);
        } catch (Exception e) {
            System.out.println("Exception occured");
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/find/{mangaId}", method = RequestMethod.GET)
    public @ResponseBody
    Manga findMangaById(@PathVariable Long mangaId) {
        return mangaService.findMangaById(mangaId);
    }

    @RequestMapping(path = "/del/{mangaId}", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteMangaById(@PathVariable Long mangaId) {

        try {
            mangaService.deleteMangaById(mangaId);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/delAll", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteAllManga() {
        try {
            mangaService.deleteAllMangas();
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

}
