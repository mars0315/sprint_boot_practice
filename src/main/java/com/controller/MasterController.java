package com.controller;

import com.service.MasterService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {

    @Autowired
    MasterService masterService;

    @GetMapping(value="/addmock")
    public String returnString() {
        return masterService.plusInt(3,4)+"";
    }
}
