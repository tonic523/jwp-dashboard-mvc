package com.techcourse.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import nextstep.mvc.controller.asis.Controller;
import nextstep.web.annotation.RequestMapping;
import nextstep.web.support.RequestMethod;

@nextstep.web.annotation.Controller
public class LogoutController implements Controller {

    @Override
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String execute(final HttpServletRequest req, final HttpServletResponse res) throws Exception {
        HttpSession session = req.getSession();
        session.removeAttribute(UserSession.SESSION_KEY);
        return "redirect:/";
    }
}
