package com.learnova.project.entity.lecturer;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "lecturer")
public class Lecturer {
    @Indexed(unique = true, name = "lecturer_code")
    private String lecturerCode;
    private String firstName;
    private String lastName;
    private Set<String> contactNo;
    private String email;
    private List<String> courseList;

}
