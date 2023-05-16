class Oops {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derved Class or Sub Class
class Fish extends Animal{
    int no_of_fins;

    void swin(){
        System.out.println("Swim in water");
    }
}