package com.abhinavan.stringmanipulatorapi.services;

import com.abhinavan.stringmanipulatorapi.StringManipulator;
import com.abhinavan.stringmanipulatorapi.models.Result;
import org.springframework.stereotype.Service;


@Service
public class StringManipulatorService implements StringManipulator
{
    public Result manipulate(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = String.valueOf(stringBuilder.reverse());
        Result result = new Result();
        result.setRes(str);
        return result;
    }
}
