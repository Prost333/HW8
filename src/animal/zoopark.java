package animal;

public class zoopark {

    private animal[] animals;
    private int nextnumber;

    public zoopark(animal[] animals, int nextnumber) {
        this.animals = animals;
        this.nextnumber = nextnumber;
    }

    public zoopark() {
        animals = new animal[25];
        nextnumber=1;
// добавляем три собаки
        animals[0]=new dog("Рекс", "овчарка", 15,"Белая", "18","говно",1);
          animals[1]= new dog("Кабочок", "Щпиц", 7,"Серая", "5","котов",1);
          animals[2]= new dog("Тузик", "Алабай", 10,"Черная", "10","мясо",1);
          animals[3]=new bird("feda","50","green","2","bread",1);
          animals[4]=new bird("тоша","70","пернатый","5","лягушек",1);
          animals[5]=new bird("Гоша","5","розовый","1","зерно",1);
    }
    public void addAnimal(animal animal) {

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }
    public void addMoreAnimals() {

        animals[6] = new bird("Он","19","розовый","1","зерно",1);
        animals[7] = new bird("Черная борода","15","черный","1","зерно",1);

        animals[8] = new dog("Барон", "Щпиц", 7,"Серая", "5","котов",1);
        animals[9] = new dog("Кабзон", "Щпиц", 7,"Серая", "5","котов",1);
    }

    public void addlion(lion lion) {

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = lion;
                break;
            }
        }
    }
//    task1.6
    public  void howmanyanimals(){
        int a=0;
        int b=0;
        for (int i =0;i<animals.length;i++){
            if (animals[i]!=null){
           a++;
        }}
        for (int i =0;i<animals.length;i++){
            if (animals[i]==null){
                b++;
            }
        }

        System.out.println("Всего в зоопарке: "+a+" животных" );
        System.out.println("Свободных мест в зоопарке: "+b);

    }
//    task1.7
    public void  addNumer() {
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null){
             animals[i].setNumer(nextnumber);
             nextnumber++;
        }}
    }

//    task1.8


    public void printAllAnimals() {
        for (int i=0;i<animals.length;i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }
    public void zooinf(int numer){
        for (int i=0;i<animals.length;i++){
            if (numer==animals[i].getNumer()){
                System.out.println(animals[i].toString());
                break;
            }
        }
    }

//    task1.9
    public  void deleteAnimal (int numer){
        for (int i=0;i<animals.length;i++){
            if (numer==animals[i].getNumer()){
                animals[i]=null;
                System.out.println("вы выгнали "+numer+" животного");
                break;
            }
        }
        printAllAnimals();
    }

    }














