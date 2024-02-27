package com.shopping.restfulapi.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "locals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Local {
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Id
    private Long id;
    @NotBlank(message = "Please add the local name")
    private String name;
    private String floor;
    @Length(min= 4, max = 10)
    private String code;


}
