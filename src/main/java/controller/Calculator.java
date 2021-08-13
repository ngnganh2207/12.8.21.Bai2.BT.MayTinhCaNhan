package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Calculator {
    @GetMapping("/")
    String getIndex(){
        return "index.jsp";
    }
    @PostMapping("/calculator")
    String calculator(HttpServletRequest request, Model model){
        float firstOperand= Float.parseFloat(request.getParameter("firstoperand"));
        float secondOperand= Float.parseFloat(request.getParameter("secondoperand"));
        char operator= request.getParameter("operator").charAt(0);
        float result= Calculator.calculator(firstOperand,secondOperand,operator);
        model.addAttribute("result", result);
        return "result.jsp";
    }

    public static float calculator(float firstOperand, float secondOperand,char operator){
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if(secondOperand!=0){
                    return firstOperand/secondOperand;
                }else {
                    throw new RuntimeException("Khong the chi cho 0");
                }

            default:
                throw new RuntimeException("Invalid Operation");



        }
    }
}
