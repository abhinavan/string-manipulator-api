package com.abhinavan.stringmanipulatorapi.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;



class StringManipulatorServiceTest {

//    @InjectMocks
//    private StringManipulatorService stringManipulatorService;

    @Test
    void manipulate()
    {
        StringManipulatorService stringManipulatorService = new StringManipulatorService();
        Assertions.assertEquals("olleh",stringManipulatorService.manipulate("hello").getRes());
    }
}