package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("admin/product")
@RestController
public class CategoryApiController {

    @RequestMapping("getCategory1")
    public Result getCategory1(){

        return Result.ok();
    }

}
