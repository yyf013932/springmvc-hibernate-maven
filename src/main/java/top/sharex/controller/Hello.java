package top.sharex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Daniel on 2017/6/7.
 */
@RestController("/")
@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
public class Hello {
    @RequestMapping("he")
    public String say(){
        return "你好";
    }
}
