package com.fastcampus.programming.dmaker.controller;


import com.fastcampus.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author L
 */
@Slf4j
@RestController // @Controller +  @ResponseBody(VO객체를 JSON으로 바꿔서 HTTP body에 담는 스프링 어노테이션)
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
      // GET /developers HTTP/1.1
        log.info("GET /delvelopers HTTP/1.1");

        return Arrays.asList("L", "mong", "Olaf");
    }

    @GetMapping("/create-developers")
    public List<String> createDevelopers() {
        // GET /developers HTTP/1.1
        log.info("GET /create-developers HTTP/1.1");

        dMakerService.createDeveloper();

        return List.of("Olaf");
    }
}
