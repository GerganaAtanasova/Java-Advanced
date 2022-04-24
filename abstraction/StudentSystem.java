import java.util.HashMap;
import java.util.Map;


public class StudentSystem {
    public Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public void parseCommand(String[] input) {
        String command = input[0];
        String name = input[1];


        if (command.equals("Create")) {
            int age = Integer.parseInt(input[2]);
            double grade = Double.parseDouble(input[3]);
            studentMap.putIfAbsent(name, new Student(name, age, grade));

        } else if (command.equals("Show")) {

            if (studentMap.containsKey(name)) {
                Student student = studentMap.get(name);
                String out = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    out += " Excellent student.";
                } else if (student.getGrade() >= 3.50) {
                    out += " Average student.";
                } else {
                    out += " Very nice person.";
                }

                System.out.println(out);
            }
        }
    }

}
