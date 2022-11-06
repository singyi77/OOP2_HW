import java.security.SecureRandom;

class sellMachine implements Runnable{
    
    static int ticket=10000;
    int soldTicket;
    Thread t;

    sellMachine(String name){
        soldTicket=0;
        t=new Thread(this, name);
        t.start();
    }

    public void run(){
        SecureRandom number=new SecureRandom();
        int i;
        do{
            i = 1 + number.nextInt(4);
            if (ticket>=i){
               soldTicket+=i;
            }
        }while (sell(i)==true);
        System.out.println(t.getName()+"共賣出"+soldTicket+"張高鐵票");
    }

    synchronized private static boolean sell(int n){
        if (ticket>0 && ticket>=n){
            ticket-=n;
            return true;
        }else if (ticket>0){
            return true;
        }else{
            return false;
        }
    }
}

public class week3_HW{
    public static void main (String[] args){
        sellMachine tA=new sellMachine("售票機A");
        sellMachine tB=new sellMachine("售票機B");
        sellMachine tC=new sellMachine("售票機C");
        sellMachine tD=new sellMachine("售票機D");
    }
}