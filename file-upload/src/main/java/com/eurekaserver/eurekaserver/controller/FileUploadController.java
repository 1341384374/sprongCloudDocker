package com.eurekaserver.eurekaserver.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/25 15:49
 */
@RestController
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String handFileUpload(@RequestParam(value = "file", required = true)MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File fileTOSave = new File(11+file.getOriginalFilename());
        FileCopyUtils.copy(bytes,fileTOSave);
        return fileTOSave.getAbsolutePath();
    }
}
