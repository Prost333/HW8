package animal;

public class lion extends animal{
    private String name;

    private  int weight;

    public lion (String name,int weight,String color, String age, String eat,int numer){
        super( color,  age,  eat,numer);
        this.name=name;

        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public  void sng(){System.out.println(name+ " рычит");}

    public  void song(){sng();}
    public void  pl(){System.out.println(name + " играет");}
    public  void  play() {pl();}

    public  String vivod(){
        String k= "Имя: "+name+" Вес: "+weight+super.toString();
        return k;
    }
    public String toString(){
        return  vivod();
    }


}
