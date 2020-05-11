package com.he.accountbook_mall.controller;


import com.he.accountbook_mall.domain.BookEntity;
import com.he.accountbook_mall.domain.VO.BookVo;
import com.he.accountbook_mall.service.IBookService;
import com.he.accountbook_mall.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BaoZhou
 * @since 2020-05-06
 */


@RestController
@RequestMapping("/api/bookEntity")
public class BookController {
    BookVo bookVo = new BookVo();

    @Autowired
    IBookService bookService;

    @GetMapping("/findall")
    public List<BookEntity> findAll() {

        List<BookEntity> list = bookService.list();
        return list;


    }


    @GetMapping("/findall/{id}")
    public BookEntity findAllid(@PathVariable Integer id) {

        BookEntity bookEntity = bookService.getById(id);

        System.out.println(bookEntity);
        return bookEntity;


    }

    @PostMapping("/save")
    public BookVo inster(@RequestBody BookEntity bookEntity) {
        System.out.println("访问成功");

        boolean b = bookService.save(bookEntity);
        if(b){
            bookVo.setCode(200);
            bookVo.setMsg("保存成功");
            return bookVo;
        }
        bookVo.setMsg("系统异常");
        bookVo.setCode(404);
        return bookVo;
    }

    @PostMapping("/update")
    public BookVo update(@RequestBody BookEntity bookEntity) {

        boolean b = bookService.updateById(bookEntity);
        if(b){
            bookVo.setCode(200);
            bookVo.setMsg("更新成功");
            return bookVo;
        }
        bookVo.setMsg("系统异常");
        bookVo.setCode(404);
        return bookVo;
    }

    @GetMapping("/delect/{id}")
    public BookVo delect(@PathVariable Integer id) {

        boolean b = bookService.removeById(id);

        if(b){
            bookVo.setCode(200);
            bookVo.setMsg("删除成功");
            System.out.println(bookVo);
            return bookVo;
        }
        bookVo.setMsg("系统异常");
        bookVo.setCode(404);
        return bookVo;
    }


}
