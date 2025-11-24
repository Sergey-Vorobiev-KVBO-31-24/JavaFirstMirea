package ru.mirea.task3;

import ru.mirea.task1.IndCycle;
import ru.mirea.task1.IndMachine;

public class FeedbackCycle extends IndCycle {
    protected IndMachine findTail()
    {
        IndMachine tail = head;
        while (tail.getNext() != head) tail = tail.getNext();
        return tail;
    }

    @Override
    public void add(IndMachine machine)
    {
        size++;

        if (head == null)
        {
            head = machine;
            head.setNext(head);
            return;
        }

        IndMachine tail = head;
        while (tail.getNext() != head) tail = tail.getNext();
        tail.setNext(machine);
        machine.setNext(head);
    }

    @Override
    public IndMachine remove(int index)
    {
        if (head == null || index < 0) return null;

        if (index == 0)
        {
            IndMachine buffer = head;
            head = head.getNext();
            findTail().setNext(head);
            size--;
            return buffer;
        }

        IndMachine tail = head;
        index--;
        while (tail.getNext() != head)
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

    @Override
    public void print(int index)
    {
        if (head == null || index < 0)
        {
            System.out.println("ОШИБКА: по указанному индексу не найден станок.");
            return;
        }

        IndMachine realTail = findTail();

        IndMachine tail = head;
        while (tail != realTail)
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

    @Override
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
        while (tail.getNext() != head)
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
}