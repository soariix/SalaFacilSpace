package com.salafacil.SalaFacilSpace.entity;

import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "Nome do curso é obrigatório")
	    @Size(max = 100, message = "Nome do curso deve ter no máximo 100 caracteres")
	    private String nome;

	    @NotBlank(message = "Período é obrigatório")
	    @Size(max = 50, message = "Período deve ter no máximo 50 caracteres")
	    private String periodo;
}
