package com.abhinavan.stringmanipulatorapi;

import com.abhinavan.stringmanipulatorapi.models.Result;
import org.springframework.stereotype.Component;

@Component
public interface StringManipulator
{
    Result manipulate(String str);

}
