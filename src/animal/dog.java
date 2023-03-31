package animal;

public class dog extends  animal {
   private String name;
    private String type;
    private int medoumWeigh;

    public  dog(String name,String type,int medoumWeigh, String color, String age, String eat,int numer){
        super(color,age,eat,numer);
        this.name=name;
        this.type=type;
        this.medoumWeigh=medoumWeigh;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMedoumWeigh() {
        return medoumWeigh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMedoumWeigh(int medoumWeigh) {
        this.medoumWeigh = medoumWeigh;
    }

    public void gavgav (){
        System.out.println(name + " гавкает");
    }
    public  void song(){
        gavgav();
    }
    public  void  play() {
       igraet();
    }

    public  void bite(){
        System.out.println(name + " кусвет");
    }
    public  void  igraet(){
        System.out.println(name + " играет");
    }
    public  void jump(){
        System.out.println(name + " прыгает");
    }

    public String vivod(){

        String l="имя "+name+" порода "+type+" вес "+medoumWeigh+ super.toString();
        return l;
    }
    public String toString(){
        return vivod();
    }


}
