package ru.mirea.task2;

public class IOTCycle {
    protected IOTMachine head;
    protected int size;

    public IOTCycle() {
        head = null;
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public void add(IOTMachine machine)
    {
        size++;

        if (head == null)
        {
            head = machine;
            return;
        }

        IOTMachine tail = head;
        while (tail.getNext() != null) tail = tail.getNext();
        tail.setNext(machine);
        machine.setPrev(tail);
    }

    public void add()
    {
        IOTMachine machine = new IOTMachine();
        machine.scanModel();
        machine.scanPower();
        machine.scanIsGoodCond();

        add(machine);
    }

    public IOTMachine remove(int index)
    {
        if (head == null || index < 0) return null;

        if (index == 0)
        {
            IOTMachine buffer = head;
            head = head.getNext();
            head.setPrev(null);
            size--;
            return buffer;
        }

        IOTMachine tail = head;
        index--;
        while (tail.getNext() != null)
        {
            if (index == 0)
            {
                IOTMachine buffer = tail.getNext();
                tail.setNext(buffer.getNext());
                tail.getNext().setPrev(tail);
                size--;
                return buffer;
            }
            tail = tail.getNext();
            index--;
        }
        return null;
    }

    public void print(int index)
    {
        if (head == null || index < 0)
        {
            System.out.println("ОШИБКА: по указанному индексу не найден станок.");
            return;
        }

        IOTMachine tail = head;
        while (tail != null)
        {
            if (index == 0)
            {
                tail.printModel();
                tail.printPower();
                tail.printIsGoodCond();
                return;
            }
            tail = tail.getNext();
            index--;
        }
        System.out.println("ОШИБКА: по указанному индексу не найден станок.");
    }

    public void clear()
    {
        head = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void add(int index, IOTMachine machine)
    {
        if (head == null || index < 0) return;

        if (index == 0)
        {
            machine.setNext(head);
            head = machine;
            machine.setPrev(head);
            size++;
            return;
        }

        IOTMachine tail = head;
        index--;
        while (tail.getNext() != null)
        {
            if (index == 0)
            {
                machine.setNext(tail.getNext());
                tail.setNext(machine);
                machine.setPrev(tail);
                size++;
                return;
            }
            tail = tail.getNext();
            index--;
        }

        if (index == 0)
        {
            tail.setNext(machine);
            size++;
        }
    }

    public void add(int index)
    {
        IOTMachine machine = new IOTMachine();
        machine.scanModel();
        machine.scanPower();
        machine.scanIsGoodCond();

        add(index, machine);
    }
}