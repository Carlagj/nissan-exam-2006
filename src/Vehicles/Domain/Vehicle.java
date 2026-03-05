package Vehicles.Domain;

public class Vehicle {
    private String id;
    private String model;
    private String matricula;
    private String color;
    private int dors;


    public Vehicle(String id, String model, String matricula, String color, int dors) {
        this.id = id;
        this.model = model;
        this.matricula = matricula;
        this.color = color;
        this.dors = dors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }
}
