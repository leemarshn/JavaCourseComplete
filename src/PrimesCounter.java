/**
 * Created by oracle on 5/7/17.
 */

import java.util.ArrayList;

public class PrimesCounter extends Thread{

    private int id;

    public PrimesCounter(int id){
        this.id = id;
    }

    public void run(){

        long startTime = System.currentTimeMillis();
        int count = countPrimes(5000000);
        long elapsedTime = System.currentTimeMillis()-startTime;
        System.out.println("The thread "+id+" took "+(elapsedTime/1000.0)+" seconds"
                + " and counted "+count+" primes");
    }

    private static int countPrimes(int val) {

        ArrayList<Integer> primes = new ArrayList();

        boolean isPrime=true;
        for (int i=3;i<=val;i++){
            if (isPrime)
                primes.add(i-1);
            int j=0;
            int sqrVal = (int) Math.sqrt(i);
            sup:for (;j<primes.size();j++){
                int div = primes.get(j);
                if (div>sqrVal){
                    isPrime=true;
                    break sup;
                }
                if (i%(primes.get(j))==0){
                    isPrime=false;
                    break sup;
                }

            }
        }
        return primes.size();
    }

    public static void main(String[] args){
        int range = 4;
        PrimesCounter[] worker = new PrimesCounter[range];
        long startTime = System.currentTimeMillis();
        for(int i=0;i<range;i++){
            worker[i] = new PrimesCounter(i+1);
            worker[i].start();
        }
        for(int i=0;i<range;i++){
            try {
                worker[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Total elapsed time: " + (elapsedTime/1000.0) + " seconds");

    }

}