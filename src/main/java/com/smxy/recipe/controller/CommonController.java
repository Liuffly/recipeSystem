package com.smxy.recipe.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.smxy.recipe.utils.ToolsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.smxy.recipe.utils.CodeApi;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zpx
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController {

    @ResponseBody
    @PostMapping("/test")
    public Map<String, Object> test(@RequestParam("file")MultipartFile multipartFile) {
        Map<String, Object> map=new HashMap<>();
        map.put("result", ToolsApi.multipartFile_upload_file(multipartFile, null));
        return map;
    }

}
