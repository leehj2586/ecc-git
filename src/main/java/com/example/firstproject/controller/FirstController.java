package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) { // model 객체 받아오기
        model.addAttribute("username", "홍팍"); // model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄
        return "greetings"; // greetings.mustache 파일 반환
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}