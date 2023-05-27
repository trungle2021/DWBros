package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meal_times", schema = "dwbros")
public class MealTimes {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "meal_time_id", nullable = false, length = 36)
    private String mealTimeId;
    @Basic
    @Column(name = "times", nullable = true, length = 50)
    private String times;

}
