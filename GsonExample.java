import com.google.gson.Gson;

class Student {
    String name;
    int age;
    String city;

    Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Create a Student object
        Student student = new Student("Alice", 22, "New York");

        // Convert Java object to JSON
        String json = gson.toJson(student);
        System.out.println("JSON representation: " + json);

        // Convert JSON back to Java object
        String jsonInput = "{\"name\":\"Bob\",\"age\":25,\"city\":\"Chicago\"}";
        Student student2 = gson.fromJson(jsonInput, Student.class);
        System.out.println("Student object created from JSON:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("City: " + student2.city);
    }
}
