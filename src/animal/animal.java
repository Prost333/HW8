package animal;

public class animal {
   private String color;
   private  String age;
   private  String eat;
   private  int numer;

    public animal(String color, String age, String eat, int numer) {
        this.color = color;
        this.age = age;
        this.eat = eat;
        this.numer= this.numer;
    }
    public int getNumer(){return numer;}
    public void  setNumer(int numer){this.numer=numer;}

    public String getColor() {
        return color;
    }

    public String getAge() {
        return age;
    }

    public String getEat() {
        return eat;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
    public  void  play() {
        System.out.println("играет");
    }

    public  void song(){
        System.out.println( "поет");
    }

    public String toString(){
        return "цвет: "+color+" возраст: "+age+" что едят: "+eat+" номер: "+numer;
    }

}


