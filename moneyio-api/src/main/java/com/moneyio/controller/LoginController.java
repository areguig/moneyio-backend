package com.moneyio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by akli on 28/03/15.
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController extends AbstractController {
    /**
     * LOGGING CONSTANT
     */
    private static final Logger	LOGGER	= Logger.getLogger(LoginController.class
            .getName());


}
