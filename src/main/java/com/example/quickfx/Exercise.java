package com.example.quickfx;

import java.time.LocalDate;

public class Exercise {
    String name;
    MuscleGroup muscleGroup;
    LocalDate date;
    double weight;
    int sets;
    int reps;

    public Exercise(String name, MuscleGroup muscleGroup, LocalDate date, double weight, int sets, int reps) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.date = date;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }
}
