package com.mochafund.identityservice.workspace.membership.dto;

import com.mochafund.identityservice.role.enums.Role;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MembershipManagementDto {

    @NotNull(message = "Workspace ID must be provided")
    private UUID userId;

    @NotEmpty(message = "At least one role must be provided")
    private Set<@NotNull Role> roles;
}
