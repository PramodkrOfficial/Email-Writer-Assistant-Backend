package com.email.writer.app;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;

    private String tone;

    // Constructor
    public EmailRequest(String emailContent, String tone) {
        this.emailContent = emailContent;
        this.tone = tone;
    }

    // Setter for emailContent (optional)
    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    // Setter for tone (optional)
    public void setTone(String tone) {
        this.tone = tone;
    }
}
