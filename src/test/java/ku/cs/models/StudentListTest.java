package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void addNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("6610405921","Hello",20);
        Student test = list.findStudentById("6610405921");
        assertEquals("Hello",test.getName());
    }

    @Test
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("6610405921","Hello");
        Student test = list.findStudentById("6610405921");
        assertEquals("Hello",test.getName());
    }

    @Test
    void findStudentById() {
        StudentList list = new StudentList();
        list.addNewStudent("66106","Hello",20);
        list.addNewStudent("66104","Helo",20);
        list.addNewStudent("66105","Hllo",20);

        Student test = list.findStudentById("66106");
        assertEquals("Hello",test.getName());
    }

    @Test
    void giveScoreToId() {
        StudentList list = new StudentList();
        list.addNewStudent("66106","Hello",20);
        list.addNewStudent("66104","Helo",20);
        list.addNewStudent("66105","Hllo",20);

        list.giveScoreToId("66106",50);
        Student test = list.findStudentById("66106");
        assertEquals(70,test.getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("66106","Hello",60);
        list.addNewStudent("66104","Helo",70);
        list.addNewStudent("66105","Hllo",80);

        list.viewGradeOfId("66105");
        Student test = list.findStudentById("66105");
        assertEquals("A",test.grade());
    }

}