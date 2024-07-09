package com.sms.student_management_system.Controller;
import com.sms.student_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/health")
    public String healthCheckup() {
        return "Status : UP";
    }
    @GetMapping("/addition/{num1}/{num2}")
    public int addition(@PathVariable int num1,@PathVariable int num2){
        int sum = num1 + num2;
        return sum;
    }
    @GetMapping("/OddOrEven/{num}")
    public String OddOrEven(@PathVariable int num){
        if(num % 2 == 0)
            return num + " is even.";
        else
            return num + " is odd.";
    }
    @GetMapping("/Discount/{qty}")
    public String Discount(@PathVariable int qty){
        int Amt = qty*100;
        if(Amt > 1000){
            return "Total Payable: "+(Amt-Amt*0.1);
        }
        return "Total Payable: "+Amt;
    }
}
