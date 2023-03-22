package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        SimpleDateFormat formatR = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);

        if (args[0].startsWith("-c")){
            Date date = null;
            try {
                date = format.parse(args[3]);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if (args[2].startsWith("м")){
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
            else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        }
        if (args[0].startsWith("-r")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            StringBuffer line = new StringBuffer();
            line.append(person.getName());
            line.append(" ");
            line.append(person.getSex() == Sex.MALE ? "м" : "ж");
            line.append(" ");
            line.append(formatR.format(person.getBirthDate()));
            System.out.println(line);
        }
        if (args[0].startsWith("-u")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(args[2]);
            if (args[3].startsWith("м")){
                person.setSex(Sex.MALE);
            }
            else{
                person.setSex(Sex.FEMALE);
            }
            Date date = null;
            try {
                date = format.parse(args[4]);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            person.setBirthDate(date);
        }
        if (args[0].startsWith("-d")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
