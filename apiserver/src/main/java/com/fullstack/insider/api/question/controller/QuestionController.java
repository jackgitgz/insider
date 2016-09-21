package com.fullstack.insider.api.question.controller;

import com.fullstack.insider.api.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名：QuestionController<br>
 * 描述：<br>
 * 创建人：zhangzhiqiang<br>
 * 创建时间：2016/9/21 14:30<br>
 *
 * @version v1.0
 */

@RestController
@RequestMapping(value = "/api/question")
public class QuestionController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getQuestion() {
        ResponseEntity responseEntity = new ResponseEntity();

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("title", "标题");
        data.put("content", "内容");

        responseEntity.success(data, "获取成功");
        return responseEntity;
    }
}
