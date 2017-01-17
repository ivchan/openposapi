package com.opencloud.openposapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ivanchan on 17/1/2017.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public abstract class ApiController {
}
