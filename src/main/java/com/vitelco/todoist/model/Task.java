package com.vitelco.todoist.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private LocalDateTime createDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
    private User assignedUser;
    private Category category;



    public Task(Long id, String title, User user, Category category) {
        this.id = id;
        this.title = title;
        this.createDate = LocalDateTime.now();
        this.assignedUser = user;
        this.category = category;
    }

    public enum Category{
        WORK, PERSONAL
    }



}
