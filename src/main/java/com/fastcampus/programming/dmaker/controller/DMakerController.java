package com.fastcampus.programming.dmaker.controller;


import com.fastcampus.programming.dmaker.dto.*;
import com.fastcampus.programming.dmaker.exception.DMakerException;
import com.fastcampus.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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
    public List<DeveloperDto> getAllDevelopers() {
        // GET /developers HTTP/1.1
        log.info("GET /delvelopers HTTP/1.1");

        return dMakerService.getAllEmployedDevelopers();
    }

    @GetMapping("/developers/{memberId}")
    public DeveloperDetailDto getDevelopersDetail(@PathVariable String memberId) {


        log.info("GET /delvelopers HTTP/1.1");

        return dMakerService.getDeveloperDetail(memberId);
    }

    @PostMapping("/create-developers")
    public CreateDeveloper.Response createDevelopers(@Valid @RequestBody CreateDeveloper.Request request) {
        // GET /developers HTTP/1.1
//      log.info("GET /create-developers HTTP/1.1");
        log.info("request : {}", request);

        return dMakerService.createDeveloper(request);

    }

    @PutMapping("/developers/{memberId}")
    public DeveloperDetailDto editDeveloper(@PathVariable String memberId,
                                            @Valid @RequestBody EditDeveloper.Request request) {


        log.info("GET /delvelopers HTTP/1.1");

        return dMakerService.editDeveloper(memberId, request);
    }

    @DeleteMapping("/developers/{memberId}")
    public DeveloperDetailDto deleteDeveloper(@PathVariable String memberId) {
        return dMakerService.deleteDeveloper(memberId);
    }

}
