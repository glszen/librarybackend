package com.alisimsek.LibraryManagementProject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthorRequest {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String country;
    private List<Long> bookIds; // Kitapların ID'lerini tutan bir liste
}