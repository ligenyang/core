package com.w.core.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    private static final Log logger = LogFactory.getLog(MainController.class);


    @RequestMapping("/*")
    public String index(HttpServletRequest request) {
        logger.info(request.getHeader("Accept"));
        logger.info(request.getHeader("Accept-Encoding"));
        logger.info(request.getHeader("Accept-Language"));
        logger.info(request.getHeader("Cache-Control"));
        logger.info(request.getHeader("Connection"));
        logger.info(request.getHeader("Host"));
        logger.info(request.getHeader("Upgrade-Insecure-Requests"));
        logger.info(request.getHeader("User-Agent"));
        logger.info(request.getParameterMap().values());
        logger.info(request.getHeaderNames().toString());
        logger.info(request.getQueryString());

        return "index";
    }
}
