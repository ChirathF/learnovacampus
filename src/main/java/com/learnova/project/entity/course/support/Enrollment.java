package com.learnova.project.entity.course.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Indexed;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {
    private String batchNo;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<StudentPayment> studentList;
}
