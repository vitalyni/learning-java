package lv.acodemy.classroom;

public class Cat {

    private String catName;
    private String catGender;
    private int catAge;
    private String catBreed;
    private String catColor;

    public Cat(String catName, String catGender, int catAge, String catBreed, String catColor) {
        this.catName = catName;
        this.catGender = catGender;
        this.catAge = catAge;
        this.catBreed = catBreed;
        this.catColor = catColor;
    }

    public Cat() {
    }

    public Cat(String catName, int catAge, String catBreed, String catColor) {
        this.catName = catName;
        this.catAge = catAge;
        this.catBreed = catBreed;
        this.catColor = catColor;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatGender() {
        return catGender;
    }

    public void setCatGender(String catGender) {
        this.catGender = catGender;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Om-nom-nom!");
    }

    public void sleep() {
        System.out.println("Z-z-Z-z-Z-z-Z");
    }

    public void walk() {
        System.out.println("I am walking...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catGender='" + catGender + '\'' +
                ", catAge=" + catAge +
                ", catBreed='" + catBreed + '\'' +
                ", catColor='" + catColor + '\'' +
                '}';
    }
}