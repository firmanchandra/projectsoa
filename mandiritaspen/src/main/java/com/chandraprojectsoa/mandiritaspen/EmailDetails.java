package com.chandraprojectsoa.mandiritaspen;

//import kebutuhan class
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Annotasi
@Data
@AllArgsConstructor
@NoArgsConstructor

//class
public class EmailDetails  { 
	
	//data anggota class
	private String toEmail;
    private String subject;
    private String messagetext;
    private String htmltext;
    private String attachment;
    private String cc;
}
