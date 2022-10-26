package br.com.coachme.models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_elos")
public class Elo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 12)
    private String name;
}
