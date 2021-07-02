package main.block03.lesson15;

import main.block03.lesson15.example.Data;

public class LombokRunner {

    public static void main(String[] args) {
        Data data = new Data();
        data.setAttribute(new Data.Attribute().setCode("code").setName("name"));
    }
}
