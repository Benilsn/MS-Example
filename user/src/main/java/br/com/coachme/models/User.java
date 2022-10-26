package br.com.coachme.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 99)
    private String name;

    @Column(name = "email", unique = true, length = 99)
    private String email;

    @Column(name = "password", length = 299)
    private String password;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name ="user_image", length = 99)
    private String user_image;

    @Column(name = "average_rating", precision = 1)
    private Float average_rating;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Role.class)
    private Role role;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Position.class)
    private Position position;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Elo.class)
    private Elo elo;
}
