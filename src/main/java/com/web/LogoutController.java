package com.web;

import com.converterDAO.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hp on 08.01.2017.
 */
public class LogoutController {
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(@ModelAttribute("userForm") User userForm){
        return "login";
    }
}
