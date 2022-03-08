package items;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EducationalMaterialTest {
    private List<EducationalMaterial> materialList;
    private User user = new User("Mr.Bean", 123321);
    @Rule
    public Timeout time = Timeout.millis(2000);
    @Test
    public void testEducationalMaterialConstructor() {
        EducationalMaterial material = new EducationalMaterial("material",user
                , 12.5, new ArrayList<>(), 1300);
        assertEquals("material", material.getName());
        assertEquals("Mr.Bean", material.getUser().getName());
        assertEquals(material.getUser(), user);
        assertEquals(12.5, material.getPrice(), 12.5 * 1e-6);
        assertTrue(material.getPrerequisites().isEmpty());
        assertEquals(1300, material.getPublishingYear());
        materialList = new ArrayList<>();
        materialList.add(material);
        EducationalMaterial nextMaterial = new EducationalMaterial("material", new User("Mr.Bean", 123321)
                , 12.5, materialList, 1300);
        assertTrue(nextMaterial.getPrerequisites().contains(material));
    }

    @Test
    public void testEducationalMaterialExperienceLevel() {
        materialList = new ArrayList<>();
        List<EducationalMaterial> list = new ArrayList<>();
        materialList.add(new EducationalMaterial("zero", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(0));
        materialList.add(new EducationalMaterial("one", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(0));
        materialList.add(new EducationalMaterial("two", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(1));
        list.add(materialList.get(2));
        materialList.add(new EducationalMaterial("three", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(3));
        materialList.add(new EducationalMaterial("four", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(1));
        materialList.add(new EducationalMaterial("five", null, 0, list, 0));
        list = new ArrayList<>();
        list.add(materialList.get(4));
        list.add(materialList.get(5));
        materialList.add(new EducationalMaterial("six", null, 0, list, 0));

        assertEquals(1, materialList.get(0).getExperienceLevel());
        assertEquals(2, materialList.get(1).getExperienceLevel());
        assertEquals(2, materialList.get(2).getExperienceLevel());
        assertEquals(3, materialList.get(3).getExperienceLevel());
        assertEquals(4, materialList.get(4).getExperienceLevel());
        assertEquals(3, materialList.get(5).getExperienceLevel());
        assertEquals(5, materialList.get(6).getExperienceLevel());
    }
}