package com.example.servlet2.web.frontcontroller.v4.controller;

import com.example.servlet2.web.frontcontroller.ModelView;
import com.example.servlet2.web.frontcontroller.v3.ControllerV3;
import com.example.servlet2.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMpa, Map<String, Object> model) {
        return "new-form";
    }
}
