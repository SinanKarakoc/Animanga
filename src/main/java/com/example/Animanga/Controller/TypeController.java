package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Type;
import com.example.Animanga.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "api/type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Type> getAllCategoryTypesFromController() {
        return typeService.getAllCategoryTypesFromService();

    }


    @RequestMapping(path = "/save", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus saveTypeController(@RequestBody Type type) {
        try {
            typeService.saveTypeService(type);
        } catch (Exception e) {
            System.out.println("Exception occured");
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/find/{typeName}", method = RequestMethod.GET)
    public @ResponseBody
    Type findTypeByName(@PathVariable String typeName) {
        return typeService.findTypeByName(typeName);
    }

    @RequestMapping(path = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Type findTypeById(@PathVariable Long id) {
        return typeService.findTypeById(id);
    }


    @RequestMapping(path = "/del/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteTypeById(@PathVariable Long id) {

        try {
            typeService.deleteTypeById(id);
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/delAll", method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteAllType() {
        try {
            typeService.deleteAllType();
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

}
