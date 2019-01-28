package com.aikucun.controller;

import com.aikucun.remote.IFeignRemote;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController implements IFeignRemote {

    @Override
    public String get() {
        return "success";
    }
}
