package animal;

public class bird extends animal {
    private String famale;
    private  String maxHightFly;

    public bird(String famale, String maxHightFly,String color, String age, String eat,int numer) {
        super(color,age,eat,numer);
        this.famale = famale;
        this.maxHightFly = maxHightFly;
    }

    public String getFamale() {
        return famale;
    }

    public void setFamale(String famale) {
        this.famale = famale;
    }

    public String getMaxHightFly() {
        return maxHightFly;
    }

    public void setMaxHightFly(String maxHightFly) {
        this.maxHightFly = maxHightFly;
    }

    public void Song (){
        System.out.println( famale + " поет");
    }

    public  void peck (){
        System.out.println(famale+ " клюет" );
    }
    public  void madechiken(){
        System.out.println(famale+" высаживает птинцов");
    }

    public String vivod(){

       String k= " семейство: "+famale+" максимальная высота полета: "+maxHightFly+super.toString();
        return k;
    }
    public String toString(){
        return vivod();
    }
    public  void  play() {
        peck();
    }
    public  void song(){
        Song();
    }
}
