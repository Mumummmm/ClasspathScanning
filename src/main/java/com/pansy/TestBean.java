package com.pansy;

public class TestBean {
    private String country;
    private int age;
    private TestBean spouse;

    public TestBean() {
    }

    public TestBean(String country) {
        this.country = country;
    }

    public TestBean(String country, int age) {
        this.country = country;
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpouse(TestBean spouse) {
        this.spouse = spouse;
    }
}
