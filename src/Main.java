
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("Введіть назву класу: ");
String nameofclass = sc.nextLine();
try{
    Class<?> classs = Class.forName(nameofclass);
    printClassInfo(classs);




} catch(ClassNotFoundException e){


    System.out.println("Не існує класу з таким ім'ям.");
}





    }


    public static void printClassInfo(Class<?> classs){
        System.out.println("Інформація про клас: "+ classs.getName());
        System.out.println("Модифікатори доступу: " + Modifier.toString(classs.getModifiers()));
System.out.println("Батьківський клас" + classs.getSuperclass().getName());
Class<?>[] interfaces = classs.getInterfaces();
if(interfaces.length>0){
    System.out.println("Інтерейси: ");
    for(Class<?> iface : interfaces){

        System.out.println(iface.getName()+ " ");
    }
    System.out.println();




}
Field[] fields = classs.getDeclaredFields();
if(fields.length>0){
    System.out.println("Поля класу: ");
    for(Field field : fields){
        System.out.println(Modifier.toString(field.getModifiers())+ " " + field.getType().getName() + " "+ field.getName());




    }



}
Constructor<?>[] constructors = classs.getDeclaredConstructors();
if(constructors.length>0){
    System.out.println("Конструктори класу: ");
    for(Constructor<?> constructor: constructors){

        System.out.println(Modifier.toString(constructor.getModifiers())+ " "+ constructor.getName()+ parameterList(constructor.getParameterTypes()));

    }




}
Method[] methods = classs.getDeclaredMethods();
if(methods.length>0){
    System.out.println("Методи класу: ");
    for (Method method : methods){
        System.out.println(Modifier.toString(method.getModifiers())+ " "+ method.getReturnType().getName() + " "+ method.getName() + parameterList(method.getParameterTypes()));


    }




}



    }

    public  static  String parameterList(Class<?>[] parameterTypes){
        StringBuilder stringB = new StringBuilder("(");
        for(int x = 0; x < parameterTypes.length; x++){
            stringB.append(parameterTypes[x].getName());
            if(x<parameterTypes.length - 1){

                stringB.append(", ");
            }


        }

        stringB.append(")");
        return  stringB.toString();

    }
}