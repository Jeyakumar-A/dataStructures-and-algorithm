package l3.railway;

public class Passenger{
        static int id=1;
        String name;
        int age;
        int passengerId;
        String berthPreference;
        String alloted;
        int number;
        public Passenger(String name,int age,String berthPreference){
            this.name=name;
            this.age=age;
            this.berthPreference=berthPreference;
            this.passengerId=id++;
            alloted="";
            number=-1;
        }
    }
