package animal;

public class main {
//    dog rex = new dog("Рекс", "овчарка", 15,"Белая", "18","говно");



    public static void main(String[] args) {
        dog rex = new dog("Рекс", "овчарка", 15,"Белая", "18","говно",1);
//        rex.gavgav();
        bird feda=new bird("fedaaaa","popygai","green","2","bread",1);
//        feda.peck();
//        System.out.println(rex.toString());
        dog djeri = new dog("djeri", "овчарка", 15,"Белая", "18","говно",1);
        dog reee=new dog("Рекс", "овчарка", 15,"Белая", "18","говно",1);
        zoopark zoo = new zoopark();
        lion leva=new lion("Лева",55,"желтый","15","людей",1);
        lion chertila= new lion("Чертила",155,"коричневый","35","людей",1);
        lion zay= new lion("Зая",155,"коричневый","35","людей",1);
        zoo.addAnimal(djeri);
        zoo.addAnimal(leva);
        zoo.addAnimal(chertila);
        zoo.addlion(zay);
        zoo.addMoreAnimals();

//        zoo.howmanyanimals();
        zoo.addNumer();
        zoo.printAllAnimals();
//        zoo.howmanyanimals();
        System.out.println("*************************");
//        zoo.zooinf(4);
//        zoo.deleteAnimal(4);








      }





    }

