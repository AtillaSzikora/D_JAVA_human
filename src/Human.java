
public class Human {
    enum Gender {MALE, FEMALE}
    Gender gender;
    String name;
    int age;
    double height;
    float weight;
    boolean hasPrius;

    public Human(Gender gender, String name, int age, double height, float weight, boolean hasPrius) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hasPrius = hasPrius;
    }

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public float getWeight() {return weight;}
    public void setWeight(float weight) {this.weight = weight;}
    public boolean isHasPrius() {return hasPrius;}
    public void setHasPrius(boolean hasPrius) {this.hasPrius = hasPrius;}

    @Override
    public String toString() {
        return "Gender:" + gender;
    }
}