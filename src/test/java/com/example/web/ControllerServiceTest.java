package com.example.web;

import com.example.service.CommandExecutor;
import com.example.service.CommandRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ControllerServiceTest {
    @Mock
    private CommandExecutor commandExecutor;

    @Mock
    private CommandRunner commandRunner;

    @InjectMocks
    private ControllerService controllerService;

    /**
     * Method under test: {@link ControllerService#runMethod(String)}
     */
    @Test
    void testRunMethod() {
        assertTrue(controllerService.runMethod("Name").isReference());
    }

    /**
     * Method under test: {@link ControllerService#runMethod(String)}
     */
    @Test
    void testRunMethod2() {
        ModelAndView actualRunMethodResult = controllerService.runMethod("delete");
        assertTrue(actualRunMethodResult.isReference());
        assertSame(actualRunMethodResult.getModel(), actualRunMethodResult.getModelMap());
    }

    /**
     * Method under test: {@link ControllerService#runMethod(String)}
     */
    @Test
    void testRunMethod3() {
        ModelAndView actualRunMethodResult = controllerService.runMethod("insert");
        assertTrue(actualRunMethodResult.isReference());
        assertSame(actualRunMethodResult.getModel(), actualRunMethodResult.getModelMap());
    }

    /**
     * Method under test: {@link ControllerService#runMethod(String)}
     */
    @Test
    void testRunMethod4() {
        ModelAndView actualRunMethodResult = controllerService.runMethod("select");
        assertTrue(actualRunMethodResult.isReference());
        assertSame(actualRunMethodResult.getModel(), actualRunMethodResult.getModelMap());
    }

    /**
     * Method under test: {@link ControllerService#runMethod(String)}
     */
    @Test
    void testRunMethod5() {
        ModelAndView actualRunMethodResult = controllerService.runMethod("update");
        assertTrue(actualRunMethodResult.isReference());
        assertSame(actualRunMethodResult.getModel(), actualRunMethodResult.getModelMap());
    }
}

