package crs.sjava.learn.CursosToLearn.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private long idAuto;
    private String marca;
    private String modelo;
    private String color;
    private Long anio;
}
