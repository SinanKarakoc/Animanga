package com.example.Animanga.Controller;

import com.example.Animanga.Entity.Categories;
import com.example.Animanga.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value="api/category")
public class CategoriesController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(path = "/getAll",method = RequestMethod.GET)
    public @ResponseBody
    List<Categories> getAllCategoriesFromController(){
        return categoryService.getAllCategoriesFromService();
    }


    @RequestMapping(path = "/save",method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveCategoryController(@RequestBody Categories category){
        try{
            categoryService.saveCategoryService(category);
        }
        catch (Exception e){
            System.out.println("Exception occured");
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }


    @RequestMapping(path = "/find/{id}",method = RequestMethod.GET)
    public @ResponseBody
    Categories findCategoriesById(@PathVariable Long id){
        return categoryService.findCategoriesById(id);
    }


    @RequestMapping(path = "/del/{id}",method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus deleteCategoriesById(@PathVariable Long id){

        try{
            categoryService.deleteCategoriesById(id);
        }
        catch(Exception e ){
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

}
