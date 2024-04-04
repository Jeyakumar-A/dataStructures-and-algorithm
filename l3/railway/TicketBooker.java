package l3.railway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBooker {
    static int availableLowerBerths=1;
     static int availableMiddleBerths=1;
     static int availableUpperBerths=1;
     static int availableRacTickets=1;
     static int availableWaitingList=1;


     static Queue<Integer> waitingList=new LinkedList<>();
     static Queue<Integer> racList=new LinkedList<>();
     static List<Integer> bookedTicketList=new ArrayList<>();

     static List<Integer> lowerBerthPositions=new ArrayList<>(Arrays.asList(1));
     static List<Integer> middleBerthPositions=new ArrayList<>(Arrays.asList(1));
     static List<Integer> upperBerthPositions=new ArrayList<>(Arrays.asList(1));   
     static List<Integer> racPositions=new ArrayList<>(Arrays.asList(1));
     static List<Integer> waitingListPositions=new ArrayList<>(Arrays.asList(1));

     static Map<Integer,Passenger> passengers=new HashMap<>();
     public void bookTicket(Passenger p,int berthInfo,String allotedBerth){
        p.number=berthInfo;
        p.alloted=allotedBerth;
        passengers.put(p.passengerId, p);
        bookedTicketList.add(p.passengerId );
        System.out.println("-----------Booked Successfully");

     }
     public void addToRac(Passenger p,int racInfo,String allotedRAC){
        p.number=racInfo;
        p.alloted=allotedRAC;
        passengers.put(p.passengerId, p);
        racList.add(p.passengerId);
        availableRacTickets--;
        racPositions.remove(0);
        System.out.println("-----------Added to RAC Successfully");
        
     }
     public void addToWaitingList(Passenger p,int waitingListInfo,String allotedWL){
        p.number=waitingListInfo;
        p.alloted=allotedWL;
        passengers.put(p.passengerId, p);
        waitingList.add(p.passengerId);
        availableWaitingList--;
        waitingListPositions.remove(0);
        System.out.println("-------------added to Waiting List Successfully");
        
     }
     public void cancelTicket(int passengerId){
        Passenger p=passengers.get(passengerId);
        passengers.remove(Integer.valueOf(passengerId));
        bookedTicketList.remove(Integer.valueOf(passengerId));
        int positionBooked=p.number;
        System.out.println("------------------------cancelled Successfully");
        if(p.alloted.equals("L")){
            availableLowerBerths++;
            lowerBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("M")){
            availableMiddleBerths++;
            middleBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("U")){
            availableUpperBerths++;
            upperBerthPositions.add(positionBooked);
        }
        if(racList.size()>0){
            Passenger passengerFromRAC=passengers.get(racList.poll());
            int positionRac=passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(Integer.valueOf(passengerFromRAC.passengerId));
            availableRacTickets++;
            if(waitingList.size()>0){
            Passenger passengerFromWaitingList=passengers.get(racList.poll());
            int positionWL=passengerFromRAC.number;
            waitingListPositions.add(positionWL);
            waitingList.remove(Integer.valueOf(passengerFromWaitingList.passengerId));
            passengerFromWaitingList.number=racPositions.get(0);
            passengerFromWaitingList.alloted="RAC";
            racList.add(passengerFromWaitingList.passengerId);
            availableWaitingList++;
            availableRacTickets--;
            }
            Main.bookTicket(passengerFromRAC);
        }

     }
     public void PrintAvailable()
     {
        System.out.println("Available Lower Berths "+availableLowerBerths);
        System.out.println("Available Middle Berths "+availableMiddleBerths);
        System.out.println("Available Upper Berths "+availableUpperBerths);
        System.out.println("Available RACs "+availableRacTickets);
        System.out.println("Available Waiting List "+availableWaitingList);
        System.out.println("-------------------------");
     }
     
     public void printPassengers()
     {

        if(passengers.size()==0){
            System.out.println("No detail of passengers");
            return;
        }
        for(Passenger p: passengers.values())
        {
            System.out.println("PAASENGER ID "+p.passengerId);
            System.out.println("Name "+p.name);
            System.out.println("Age "+p.age);
            System.out.println("Status "+p.number+p.alloted);
        }

        
     }    
    
}
