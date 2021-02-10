package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String rsl = "{" + System.lineSeparator();
        rsl = rsl + "   \"name\": \"" + name + "\"," + System.lineSeparator();
        rsl = rsl + "   \"body\": \"" + body + "\"" + System.lineSeparator();
        rsl = rsl + "}";
        return rsl;
    }

}
