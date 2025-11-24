package ru.mirea.task1;

public class IndCycle {
    protected IndMachine head;
    protected int size;

    public IndCycle() {
        head = null;
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public void add(IndMachine machine)
    {
        size++;

        if (head == null)
        {
            head = machine;
            return;
        }

        IndMachine tail = head;
        while (tail.getNext() != null) tail = tail.getNext();
        tail.setNext(machine);
    }

    public void add()
    {
        IndMachine machine = new IndMachine();
        machine.scanModel();
        machine.scanPower();
        machine.scanIsGoodCond();

        add(machine);
    }

    public IndMachine remove(int index)
    {
        if (head == null || index < 0) return null;

        if (index == 0)
        {
            IndMachine buffer = head;
            head = head.getNext();
            size--;
            return buffer;
        }

        IndMachine tail = head;
        index--;
        while (tail.getNext() != null)
        {
            if (index == 0)
            {
                IndMachine buffer = tail.getNext();
                tail.setNext(buffer.getNext());
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

        IndMachine tail = head;
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

    public void add(int index, IndMachine machine)
    {
        if (head == null || index < 0) return;

        if (index == 0)
        {
            machine.setNext(head);
            head = machine;
            size++;
            return;
        }

        IndMachine tail = head;
        index--;
        while (tail.getNext() != null)
        {
            if (index == 0)
            {
                machine.setNext(tail.getNext());
                tail.setNext(machine);
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
        IndMachine machine = new IndMachine();
        machine.scanModel();
        machine.scanPower();
        machine.scanIsGoodCond();

        add(index, machine);
    }
}