package com.charanvandan.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "index";
    }

    @PostMapping("/contact")
    public String submitContact(
            @Valid @ModelAttribute("contactForm") ContactForm form,
            BindingResult result,
            RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("formError", "Please fill in all required fields correctly.");
            return "redirect:/#contact";
        }

        // Here you would typically save to DB or send email
        redirectAttributes.addFlashAttribute("formSuccess",
                "Thank you, " + form.getName() + "! We will get back to you soon.");
        return "redirect:/#contact";
    }

    public static class ContactForm {
        @NotBlank(message = "Name is required")
        private String name;

        @NotBlank(message = "Email is required")
        @Email(message = "Please enter a valid email")
        private String email;

        private String phone;

        private String campaignType;

        @NotBlank(message = "Message is required")
        private String message;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public String getCampaignType() { return campaignType; }
        public void setCampaignType(String campaignType) { this.campaignType = campaignType; }

        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
    }
}
