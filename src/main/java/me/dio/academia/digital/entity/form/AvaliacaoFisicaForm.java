package me.dio.academia.digital.entity.form;

import java.util.Optional;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Optional<Aluno> alunoId;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo ${value}.")
  private double altura;

  public Optional<Aluno> getAlunoId() {
    return alunoId;
  }

public Object getPeso() {
    return peso;
}

public Object getAltura() {
    return altura;
}
}
