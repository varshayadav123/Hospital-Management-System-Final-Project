package com.cg.hospitalmanagement.controller;
 
 import org.springframework.beans.factory.annotation.Autowired; 
 import org.springframework.stereotype.Controller; 
 import org.springframework.ui.Model; 
 import org.springframework.web.bind.annotation.GetMapping; 
 import org.springframework.web.bind.annotation.ModelAttribute; 
 import org.springframework.web.bind.annotation.PathVariable; 
 import org.springframework.web.bind.annotation.PostMapping;
 import com.cg.hospitalmanagement.model.Payment; 
 import com.cg.hospitalmanagement.service.PaymentService;

 @Controller
 public class PaymentController {
 
 
	 @Autowired 
	 private PaymentService paymentService;
	 
	 @GetMapping("/paymentlist") 
	 public String viewHomePage(Model model) {
       model.addAttribute("listPayments",paymentService.getAllPayments()); 
		  return "/paymentlist";
   	 }

     @GetMapping("/showNewPaymentForm") 
	 public String showNewPaymentForm(Model model) { 
		Payment payment = new Payment();
		model.addAttribute("payment",payment); 
		return "new_payment"; 
	  }
		 
	 @PostMapping("/makePayment") 
      public String makePayment(@ModelAttribute("payment") Payment payment) { 
			  //save Doctor to database 
		paymentService.makePayment(payment); 
		return "redirect:/paymentlist";
	   }
		  
	  @GetMapping("/cancelPayment/{id}") 
	  public String cancelPayment(@PathVariable(value= "id") long id) {
		this.paymentService.cancelPaymentById(id); 
		return "redirect:/paymenttlist";
		  
		}
		  
  
  }
 