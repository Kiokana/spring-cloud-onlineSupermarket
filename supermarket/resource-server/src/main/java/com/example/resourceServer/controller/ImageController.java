package com.example.resourceServer.controller;

import com.example.resourceServer.utils.ImgUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImageController {
    @PostMapping("/updateUserPhoto")
    public String updateUserPhoto(@RequestParam MultipartFile photo) throws IOException {
        String photoUrl = ImgUtil.storeImage(photo);
        return photoUrl;
    }
}
