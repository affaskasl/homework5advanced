public class Animal {
    public String name;
    private int paws;
    protected boolean tail;




    public Animal(String name, int paws, boolean tail){
        this.name=name;
        this.paws=paws;
        this.tail=tail;



    }
    public void printMethod(){
        System.out.println("Імя - "+name);
        System.out.println("Кількість лап - "+paws);
        System.out.println("Наявність хвоста - "+tail);
    }

}
