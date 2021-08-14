package collections_problems.copy_or_clone_map_p75;

import java.time.LocalDate;
public class Employee {


    private  Long id;
    private String name;
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public Employee(Long id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

}
