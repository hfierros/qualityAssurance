package iteso.qaclass.angle.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RestController
public class AngleErrorController implements ErrorController {
    private static final String PATH = "/error";

    @RequestMapping(value=PATH)
    public String error(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            HttpStatus statusCode = HttpStatus.valueOf((Integer) status);

            if (statusCode == HttpStatus.BAD_REQUEST) {
                return "Bad parameters: Specify both x & y, and y should be greater than 0";
            }
        }
        String errorMsg = "Error: " + status.toString();
        return errorMsg;
    }


}