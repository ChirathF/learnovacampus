package com.learnova.project.entity.course.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPayment {
    private String studentCode;
    private PaymentStatus paymentStatus;
}
