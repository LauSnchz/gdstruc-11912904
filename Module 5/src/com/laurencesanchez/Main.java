package com.laurencesanchez;

public class Main {

    public static void main(String[] args) {

        Player lau = new Player(52, "SunCheese", 99);
        Player jana = new Player(4, "AsheMauve", 109);
        Player chonkers = new Player(153, "CJ Entus Intex", 89);
        Player joswel = new Player(21, "Gudetamax", 89);
        Player dabbo = new Player(17, "Chi Si Mi", 131);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(lau.getUserName(), lau);
        hashtable.put(jana.getUserName(), jana);
        hashtable.put(chonkers.getUserName(), chonkers);
        hashtable.put(joswel.getUserName(), joswel);
        hashtable.put(dabbo.getUserName(), dabbo);

        //System.out.println(hashtable.remove("Gudetamax"));
        hashtable.printHashtable();

    }
}
