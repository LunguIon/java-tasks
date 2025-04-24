package ex_5;

import com.learn.task2.ex_5.CompanyStaff;

import com.learn.task2.ex_5.CustomList;
import com.learn.task2.ex_5.Director;
import com.learn.task2.ex_5.Workers;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class StaffListTest {
    CustomList staff;
    CustomList emptyList = new CustomList();
    CompanyStaff companyStaff = new CompanyStaff();

    @Before
    public void setUp() {
        staff = CompanyStaff.initialize();

    }

    @Test
    public void testIterateEmployees() {
        String result = companyStaff.iterateEmployees();
        assertEquals("juniors middles seniors teamLid " +
                "juniorManager seniorManager deputyDirector " +
                "director accountant lawyer ", result);
    }

    @Test
    public void testAddEmployee() {
        emptyList.add(new Workers(new Director(),"director"));
        assertEquals("director", emptyList.get(0));
    }

    @Test
    public void testAddExtraEmployee() {
        Workers worker = new Workers(new Director(),"director");
        assertThrows(IndexOutOfBoundsException.class, () ->staff.add(worker));
    }
    


    @Test
    public void testGetEmployeeReverseSequenceFirst() {
        String result = staff.get(0);
        assertEquals("juniors", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceSecond() {
        String result = staff.get(1);
        assertEquals("middles", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceThird() {
        String result = staff.get(2);
        assertEquals("seniors", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceFourth() {
        String result = staff.get(3);
        assertEquals("teamLid", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceFifth() {
        String result = staff.get(4);
        assertEquals("juniorManager", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceSixth() {
        String result = staff.get(5);
        assertEquals("seniorManager", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceSeventh() {
        String result = staff.get(6);
        assertEquals("deputyDirector", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceEighth() {
        String result = staff.get(7);
        assertEquals("director", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceNinth() {
        String result = staff.get(8);
        assertEquals("accountant", result);
    }

    @Test
    public void testGetEmployeeReverseSequenceTenth() {
        String result = staff.get(9);
        assertEquals("lawyer", result);
    }

}
