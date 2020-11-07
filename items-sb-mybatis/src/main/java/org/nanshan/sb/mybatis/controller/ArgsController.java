package org.nanshan.sb.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/7/9
 */
@RestController
public class ArgsController {

    @GetMapping("/long")
    public String hello(Long id) {
        return String.valueOf(id);
    }
}
