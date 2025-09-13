package com.mochafund.identityservice.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDto {

    @Email(message = "Email is not valid")
    private String email;

    @Size(min = 1, max = 100, message = "Given name must be between 1 and 100 characters")
    private String givenName;

    @Size(min = 1, max = 100, message = "Family name must be between 1 and 100 characters")
    private String familyName;
}