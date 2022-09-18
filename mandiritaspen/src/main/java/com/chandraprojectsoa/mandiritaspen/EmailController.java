package com.chandraprojectsoa.mandiritaspen;

import com.chandraprojectsoa.mandiritaspen.EmailDetails;
import com.chandraprojectsoa.mandiritaspen.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Annotation
@RestController
//Class

public class EmailController {

	 @Autowired private EmailService emailService;
	 
	    // Sending email with attachment
	    @PostMapping("/sendMailWithAttachment")
	    public String sendMailWithAttachment(
	        @RequestBody EmailDetails details)
	    {
	        String status
	            = emailService.sendMailWithAttachment(details);
	 
	        return status;
	    }
	
}
