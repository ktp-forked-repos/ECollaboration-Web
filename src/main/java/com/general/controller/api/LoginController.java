package com.general.controller.api;

import com.general.dto.LoginDTO;
import com.general.dto.ParamExceptionDTO;
import com.general.dto.UserParam;
import com.general.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by joanna on 1/4/17.
 */
@Controller
@RequestMapping("/api/")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "login")
    @ResponseBody public LoginDTO postLogin(@Valid @RequestBody UserParam userParam, @RequestHeader("access-token") String accessToken){
        return loginService.doLogin(userParam,accessToken);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException e) {
        List<ObjectError> objectErrors = e.getBindingResult().getAllErrors();
        List<ParamExceptionDTO> paramExceptionDTOs = new LinkedList<>();
        for (Iterator i = objectErrors.listIterator(); i.hasNext(); ) {
            ObjectError objectError = (ObjectError) i.next();
            ParamExceptionDTO paramExceptionDTO = new ParamExceptionDTO();
            paramExceptionDTO.setObjectName(objectError.getObjectName());
            paramExceptionDTO.setMessage(objectError.getDefaultMessage());
            paramExceptionDTOs.add(paramExceptionDTO);
        }
        return new ResponseEntity<String>(paramExceptionDTOs.toString(), HttpStatus.BAD_REQUEST);
    }
}
