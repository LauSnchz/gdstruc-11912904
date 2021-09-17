package com.laurencesanchez;

//import java.util.ArrayList;
//import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player lau = new Player(1, "Lau", 250);
        Player dale = new Player(2, "Dale", 100);
        Player david = new Player(3, "David", 306);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(lau);
        playerLinkedList.addToFront(dale);
        playerLinkedList.addToFront(david);

        //playerLinkedList.removeFirst();
        //playerLinkedList.contains(lau, 1, "Lau", 250);
        playerLinkedList.indexOf(david);

        //playerLinkedList.printList();

    }
}

/*
        List<Player> playerlist = new ArrayList<>();

        playerlist.add(new Player(1, "Lau", 250));
        playerlist.add(new Player(2, "Dale", 100));
        playerlist.add(new Player(3, "David", 306));

        playerlist.add(2, new Player(55, "Kyle", 125)); // insert an element in the middle of the array

        playerlist.remove(2); // removes an element if the index is known

        System.out.println(playerlist.contains(new Player(1, "Lau", 250))); // uses contain method to find an element but must use equals and hascode

        System.out.println(playerlist.indexOf(new Player(1, "Lau", 250))); // find index using element

        for (Player p : playerlist)
        {
            System.out.println(p);
        }

        System.out.println(playerlist.get(1)); // access an element based on index

        playerlist.forEach(player-> System.out.println(player)); // java 8 foreach */
