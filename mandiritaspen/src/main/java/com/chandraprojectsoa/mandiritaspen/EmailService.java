//service interface

package com.chandraprojectsoa.mandiritaspen;

//Import kebutuhan class
import com.chandraprojectsoa.mandiritaspen.EmailDetails;

public interface EmailService {
	
	// Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);

}
