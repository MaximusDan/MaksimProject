public class Working {

    public String name = "";
    public int age;
    public String work;
    public String department;
    public int money;
    public int yearsWorking;

    public static void createWorking(){
        Working workingMan = new Working();
        workingMan.name = "Максим";
        workingMan.age = 20;
        workingMan.work = "Прогер";
        workingMan.department = "Java";
        workingMan.money = 1000;
        workingMan.yearsWorking = 5;
        workingMan.showFirstWorking();

        Working workingMan2 = new Working();
        workingMan2.name = "Петя";
        workingMan2.work = "Прогер";
        workingMan2.department = "Java";
        workingMan2.yearsWorking = 5;
        workingMan2.lookWorkingMan2();

    }





    public void lookWorkingMan2() {
        if(this.name == null || this.name== " " ){
            System.out.println("Имени у данного челика нет");
        }else{
            System.out.println("Имя второго рабочего" + " " + name);
        }
        if(this.age == 0){
            System.out.println("Возраста у данного челика нет");
        }else{
            System.out.println("Возраст" + " " + age);
        }
        if(this.work == null || this.work== " " ){
            System.out.println("Должности у данного челика нет");
        }else{
            System.out.println("Должность" + " " + work);
        }
        if(this.department == null || this.department== " " ){
            System.out.println("Отделения у данного челика нет");
        }else{
            System.out.println("Отделение" + " " + department);
        }
        if(this.money == 0){
            System.out.println("З.П у данного челика нет");
        }else{
            System.out.println("З.П" + " " + money);
        }
        if(this.yearsWorking == 0){
            System.out.println("Х.з сколько он работает лет");
        }else{
            System.out.println("Работает" + " " + yearsWorking + " лет");
        }
    }




    public void showFirstWorking() {
        System.out.println("Working{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", department='" + department + '\'' +
                ", money=" + money +
                ", yearsWorking=" + yearsWorking +
                '}');
        System.out.println();

    }

}
