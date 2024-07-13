package com.learnova.project.entity.course;

import com.learnova.project.entity.course.support.Enrollment;
import com.learnova.project.entity.course.support.Level;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;

@Data
@NoArgsConstructor
@Document(collection = "course")
public class Course {
    @Indexed(unique = true, name = "course_code")
    private String courseCode;
    private String courseName;
    private Level level;
    private String lecturerCode;
    private String courseFee;
    private Enrollment enrollment;


}
