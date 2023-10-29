package com.example.githubactiontest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 업무그룹명 : githubactiontest
 * 프로그램명 : com.example.githubactiontest.controller
 * 파  일  명 : TestController
 * 프로그램개요 :
 * 작 성 자 : 신대수
 * 작 성 일 : 2023/10/29 3:10 PM
 * 프로그램버전: v0.1
 * 수정이력 :
 * =============================================================================
 * 수   정   일     수 정 자      수   정   내   용
 * -----------------------------------------------------------------------------
 * 2023/10/29       신대수       최초 생성
 * -----------------------------------------------------------------------------
 * 기타사항 :
 * <p>
 * Copyright : www.datanuri.net
 **/
@RestController
public class TestController {

    @Value("${app.version}")
    private String version;

    @GetMapping
    public String checkVersion(){
        return new StringBuilder().append("CI/CD version Check :").append(version).toString();
    }
}
