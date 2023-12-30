package src;

public class Main {
    public static void main(String args[]){
        HashTable<Integer, Student> students = new HashTable<>(10);
        students.put(1111, new Student("Harry", "Potter", 20, 4));
        students.put(2222, new Student("Arry", "Otter", 21, 4.2));
        students.put(3333, new Student("Hary", "Rotter", 19, 5));
        students.put(4444, new Student("Garry", "Poter", 20, 4.7));
        students.put(5555, new Student("Gary", "Pooter", 20, 4.1));

        System.out.println(students.get(3333).getFirstName());
        System.out.println(students.size());
        students.remove(4444);
        System.out.println(students.size());
        System.out.println(students.isEmpty());
        System.out.println(students.get(4444));
    }
}