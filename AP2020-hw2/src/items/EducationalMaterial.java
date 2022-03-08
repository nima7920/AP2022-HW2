package items;

import users.User;

import java.util.List;

public class EducationalMaterial extends Good{
    private double price;
    private List<EducationalMaterial> prerequisites;
    private int publishingYear;
    public EducationalMaterial(String name, User user, double price, List<EducationalMaterial> prerequisites, int publishingYear){
        super(name, user);
        this.prerequisites = prerequisites;
        this.publishingYear = publishingYear;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public List<EducationalMaterial> getPrerequisites() {
        return prerequisites;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public int getExperienceLevel(){
        int res = 0;
        for (EducationalMaterial prerequisite : prerequisites) {
           res = Math.max(res, prerequisite.getExperienceLevel());
        }
        return res + 1;
    }
}
