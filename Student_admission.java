import java.util.Scanner;

class details {
    String name, branch;
    int age, rank;
    int total_student;
    int pc_count = 0, ec_count = 0, e = 1, p = 1;
    Scanner sc = new Scanner(System.in);

    void read(String n, String b, int a, int r) {
        name = n;
        branch = b;
        age = a;
        rank = r;
        total_student = total_student + 1;

        if (branch == "cse") {
            ec_count = ec_count + 1;
            if (ec_count > 2) {
                e = e + 1;
            }
            System.out.println("you are allocated to ec-" + e);
        } else {
            pc_count = pc_count + 1;
            if (pc_count > 2) {
                p = p + 1;
            }
            System.out.println("you are allocated to pc-" + p);
        }
    }

    void read() {
        System.out.println("Enter the Name");
        name = sc.next();
        System.out.println("Enter the Rank");
        rank = sc.nextInt();
        System.out.println("Enter the Branch");
        branch = sc.next();
        System.out.println("Enter the Age");
        age = sc.nextInt();
        total_student += 1;
        if (branch == "CSE") {
            ec_count = ec_count + 1;
            if (ec_count > 2) {
                e = e + 1;
            }
            System.out.println("you are allocated to ec-" + e);
        } else {
            pc_count = pc_count + 1;
            if (pc_count > 2) {
                p = p + 1;
            }
            System.out.println("you are allocated to pc-" + p);
        }
    }

    void display() {
        System.out.println("Name=" + name + "\tRank=" + rank + "\tBranch=" + branch + "\tAge=" + age + "\tStudents="
                + total_student);
    }

    public class Student_admission {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of the Student");
            String nam = in.next();
            System.out.println("Enter the Age of the Student");
            int a = in.nextInt();
            System.out.println("Enter the Branch of the Student");
            String b = in.next();
            System.out.println("Enter the Rank of the Student");
            int r = in.nextInt();
            details s1 = new details();
            s1.read(nam, b, r, a);
            s1.display();
            details s2 = new details();
            s2.read();
            s2.display();
            details s3 = new details();
            s3.read();
            s3.display();
        }

    }
}
