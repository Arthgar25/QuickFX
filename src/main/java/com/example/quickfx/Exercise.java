package com.example.quickfx;

import java.time.LocalDate;

public class Exercise {
    private String name;
    private MuscleGroup muscleGroup;
    private LocalDate date;
    private double weight;
    private int sets;
    private int reps;

    public Exercise(String name, MuscleGroup muscleGroup, LocalDate date, double weight, int sets, int reps) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.date = date;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
