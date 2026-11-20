package org.example.schooling;

public class Teachers {

    private int id;
    private String name;
    private String subject;

    private School school;

    public int getId() {
        return id;
    }

    public Teachers(int id, School school) {
        this.id = id;
        this.school = school;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teachers() {
        System.out.println("Teachers Object Created");
    }

}
