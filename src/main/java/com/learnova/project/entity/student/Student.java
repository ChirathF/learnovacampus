package com.learnova.project.entity.student;

import com.learnova.project.entity.PersistObject;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Data
@Getter
@Setter
@NoArgsConstructor
@Document (collection = "student")
public class Student extends PersistObject {
    @Indexed(unique = true, name = "student_code")
    private String studentCode;
    private String firstName;
    private String lastName;
    private Set<String> contactNo;
    private String address;
    private String nic;
    private String email;
    private LocalDate birthDate;

    public Student(String studentCode, String firstName, String lastName, Set<String> contactNo, String address, String email) {
        this.studentCode = studentCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
    }

    public Student(String studentCode, String email, LocalDate birthDate) {
        this.studentCode = studentCode;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Student(String studentCode, String firstName, String lastName, Set<String> contactNo, String address, String nic, String email, LocalDate birthDate) {
        this.studentCode = studentCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.nic = nic;
        this.email = email;
        this.birthDate = birthDate;
    }

}
