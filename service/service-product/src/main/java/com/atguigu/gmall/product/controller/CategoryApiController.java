package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.product.service.CategoryApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("admin/product")
@RestController
@CrossOrigin
public class CategoryApiController {

    @Autowired
    private CategoryApiService categoryApiService;

    @RequestMapping("getCategory1")
    public Result getCategory1(){
        List<BaseCategory1> baseCategory1List = categoryApiService.getCategory1();
        return Result.ok(baseCategory1List);
    }

}
