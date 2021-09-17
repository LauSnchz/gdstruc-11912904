package com.laurencesanchez;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            size++;
        }
        System.out.println("null");
        System.out.println("Size of array: " + size);
    }

    public void removeFirst()
    {
        if(head == null)
            return;

        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp = null;
    }

    public void contains(Player player, int id, String name, int level)
    {
        if(player.getId() == id && player.getName() == name && player.getLevel() == level)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    public void indexOf(Player player)
    {
        PlayerNode current = head;
        PlayerNode temp = new PlayerNode(player);
        int index = 0;
        while(current != null)
        {
            index++;
            if(current.getPlayer() == temp.getPlayer())
            {
                break;
            }
            current = current.getNextPlayer();
        }
        System.out.println(index);
    }

}

