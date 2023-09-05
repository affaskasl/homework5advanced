import java.lang.reflect.*;

public class Cat {
    public static void main(String[] args) {
        Class<?> classs = Animal.class;
        try{
            Field namefield = classs.getDeclaredField("name");
            Field pawsfield = classs.getDeclaredField("paws");
            Field tailfield = classs.getDeclaredField("tail");
namefield.setAccessible(true);
pawsfield.setAccessible(true);
tailfield.setAccessible(true);
Animal instance = new Animal("Boris", 4, true);
String name = (String) namefield.get(instance);
int paws = (int) pawsfield.get(instance);
boolean tail = (boolean) tailfield.get(instance);
System.out.println("Ім'я - " + name);
            System.out.println("Кількість лап - "+ paws);

            System.out.println("Наявність хвоста - "+ tail);
        } catch (NoSuchFieldException | IllegalAccessException e){


e.printStackTrace();
        }









    }


}
