package com.abhinavan.stringmanipulatorapi;

import com.abhinavan.stringmanipulatorapi.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class StringManipulateController
{


    @Autowired
    private StringManipulator stringManipulator;
    @GetMapping("/manipulate/{str}")
    public Result manipulate(@PathVariable String str)
    {
        return stringManipulator.manipulate(str);
    }
}
