package com.example.movies.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.movies.service.ContentService;
import com.example.movies.service.CoordinationService;
import com.example.movies.service.PortraitService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private PortraitService portraitService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private CoordinationService coordinationService;


    /**
     * 获取用户画像的数据
     */
    @RequestMapping(value = "/portrait",method = RequestMethod.GET)
    public JSONObject getPortrait(HttpSession session){
        int id = Integer.valueOf((String)session.getAttribute("username"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("MOVIES",portraitService.getMoviesById(id));
        return jsonObject;
    }

    /**
     * 获取协同推荐算法的数据
     */
    @RequestMapping(value = "/coordination",method = RequestMethod.GET)
    public JSONObject getCoordination(HttpSession session){
        int id = Integer.valueOf((String)session.getAttribute("username"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("MOVIES",coordinationService.getMoviesById(id));
        return jsonObject;
    }

    /**
     * 获取基于内容的推荐算法数据
     */
    @RequestMapping(value = "/content",method = RequestMethod.GET)
    public JSONObject getontent(HttpSession session){
        int id = Integer.valueOf((String)session.getAttribute("username"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("MOVIES",contentService.getMoviesById(id));
        return jsonObject;
    }

    /**
     * 搜索
     */
    @RequestMapping(value = "/search",method = RequestMethod.GET,params = "id")
    public JSONObject search(@Param("id") Integer id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("MOVIES",portraitService.getMoviesById(id));
        return jsonObject;
    }

}
