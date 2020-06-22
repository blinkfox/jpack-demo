package com.blinkfox.jpack.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController.
 *
 * @author blinkfox on 2020-06-22.
 * @since v1.0.0
 */
@RequestMapping
@RestController
public class IndexController {

    /**
     * 首页 Hello World.
     *
     * @return Hello World
     */
    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World!");
    }

}
