package com.bafeimao.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: security
 * @package: com.bafeimao.security.demo
 * @className: DemoController
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 8:11
 * @version: 1.0
 */
@RestController
@RequestMapping("api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from security endpoint");
    }

}
