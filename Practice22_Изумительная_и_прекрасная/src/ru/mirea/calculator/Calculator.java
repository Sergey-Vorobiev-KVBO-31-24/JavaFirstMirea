package ru.mirea.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    protected JPanel mainPanel = new JPanel();
    protected JTextField outputArea = new JTextField("Добро пожаловать ^_^ (калькулятор работает в обратной польской записи)");
    protected JButton resultButton = new JButton("Получить результат");
    protected InputPanel inputPanel = new InputPanel(outputArea, resultButton);

    public Calculator() throws HeadlessException {
        super("Мой классный калькулятор");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(475, 250);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        mainPanel.setLayout(layout);

        outputArea.setEditable(false);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 0, 0, 0);
        layout.setConstraints(outputArea, constraints);
        mainPanel.add(outputArea);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10, 0, 0, 0);
        layout.setConstraints(resultButton, constraints);
        mainPanel.add(resultButton);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 4;
        constraints.insets = new Insets(10, 0, 0, 0);
        layout.setConstraints(inputPanel, constraints);
        mainPanel.add(inputPanel);

        getContentPane().add(mainPanel);
    }

    static class InputPanel extends JPanel {
        protected JButton btn0 = new JButton("0");
        protected JButton btn1 = new JButton("1");
        protected JButton btn2 = new JButton("2");
        protected JButton btn3 = new JButton("3");
        protected JButton btn4 = new JButton("4");
        protected JButton btn5 = new JButton("5");
        protected JButton btn6 = new JButton("6");
        protected JButton btn7 = new JButton("7");
        protected JButton btn8 = new JButton("8");
        protected JButton btn9 = new JButton("9");
        protected JButton btnAdd = new JButton("+");
        protected JButton btnSub = new JButton("-");
        protected JButton btnMulti = new JButton("*");
        protected JButton btnDiv = new JButton("/");
        protected JButton btnSpace = new JButton("Пробел");
        protected JButton btnFloat = new JButton(".");

        public InputPanel(JTextField outputArea, JButton resultButton) {
            super();

            setLayout(new GridLayout(4, 4));

            add(btn1);
            add(btn2);
            add(btn3);
            add(btnAdd);

            add(btn4);
            add(btn5);
            add(btn6);
            add(btnSub);

            add(btn7);
            add(btn8);
            add(btn9);
            add(btnMulti);

            add(btnSpace);
            add(btn0);
            add(btnFloat);
            add(btnDiv);

            ActionListener listener = new ActionListener() {
                String expression = "";
                boolean isFloat = false;
                ExpLastChar lastChar = ExpLastChar.SPACE;

                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.length() > 5 && command.substring(0,5).equals("Цифра"))
                    {
                        expression = expression + command.charAt(command.length()-1);
                        lastChar = ExpLastChar.DIGIT;
                    }
                    else if (command.equals("Плюс"))
                    {
                        if (lastChar == ExpLastChar.FLOATING_DOT || lastChar == ExpLastChar.MINUS_SIGN) expression += '0';
                        if (lastChar != ExpLastChar.SPACE) expression += ' ';
                        expression += "+ ";
                        isFloat = false;
                        lastChar = ExpLastChar.SPACE;
                    }
                    else if (command.equals("Минус"))
                    {
                        if (lastChar == ExpLastChar.SPACE)
                        {
                            expression += '-';
                            lastChar = ExpLastChar.MINUS_SIGN;
                        }
                    }
                    else if (command.equals("Умножить"))
                    {
                        if (lastChar == ExpLastChar.FLOATING_DOT || lastChar == ExpLastChar.MINUS_SIGN) expression += '0';
                        if (lastChar != ExpLastChar.SPACE) expression += ' ';
                        expression += "* ";
                        isFloat = false;
                        lastChar = ExpLastChar.SPACE;
                    }
                    else if (command.equals("Разделить"))
                    {
                        if (lastChar == ExpLastChar.FLOATING_DOT || lastChar == ExpLastChar.MINUS_SIGN) expression += '0';
                        if (lastChar != ExpLastChar.SPACE) expression += ' ';
                        expression += "/ ";
                        isFloat = false;
                        lastChar = ExpLastChar.SPACE;
                    }
                    else if (command.equals("Пробел"))
                    {
                        if (lastChar == ExpLastChar.FLOATING_DOT || lastChar == ExpLastChar.MINUS_SIGN) expression += '0';
                        if (lastChar != ExpLastChar.SPACE) expression += ' ';
                        isFloat = false;
                        lastChar = ExpLastChar.SPACE;
                    }
                    else if (command.equals("Дробное"))
                    {
                        if (lastChar == ExpLastChar.SPACE || lastChar == ExpLastChar.MINUS_SIGN)
                        {
                            expression += "0.";
                            lastChar = ExpLastChar.FLOATING_DOT;
                        }
                        else if (!isFloat)
                        {
                            expression += '.';
                            lastChar = ExpLastChar.FLOATING_DOT;
                        }
                        isFloat = true;
                    }
                    else if (command.equals("Выдать результат"))
                    {
                        parseExpression(expression);
                        expression = "";
                        isFloat = false;
                        lastChar = ExpLastChar.SPACE;
                    }
                    outputArea.setText(expression);
                }
            };

            btn0.addActionListener(listener);
            btn1.addActionListener(listener);
            btn2.addActionListener(listener);
            btn3.addActionListener(listener);
            btn4.addActionListener(listener);
            btn5.addActionListener(listener);
            btn6.addActionListener(listener);
            btn7.addActionListener(listener);
            btn8.addActionListener(listener);
            btn9.addActionListener(listener);
            btnAdd.addActionListener(listener);
            btnSub.addActionListener(listener);
            btnMulti.addActionListener(listener);
            btnDiv.addActionListener(listener);
            btnSpace.addActionListener(listener);
            btnFloat.addActionListener(listener);
            resultButton.addActionListener(listener);

            btn0.setActionCommand("Цифра 0");
            btn1.setActionCommand("Цифра 1");
            btn2.setActionCommand("Цифра 2");
            btn3.setActionCommand("Цифра 3");
            btn4.setActionCommand("Цифра 4");
            btn5.setActionCommand("Цифра 5");
            btn6.setActionCommand("Цифра 6");
            btn7.setActionCommand("Цифра 7");
            btn8.setActionCommand("Цифра 8");
            btn9.setActionCommand("Цифра 9");
            btnAdd.setActionCommand("Плюс");
            btnSub.setActionCommand("Минус");
            btnMulti.setActionCommand("Умножить");
            btnDiv.setActionCommand("Разделить");
            btnSpace.setActionCommand("Пробел");
            btnFloat.setActionCommand("Дробное");
            resultButton.setActionCommand("Выдать результат");
        }

        protected void parseExpression(String exp)
        {
            if (exp.isEmpty()) showMessage_allIsOkay(0);

            Stack stack = new Stack();

            StringBuilder buffer = new StringBuilder();
            for (int i=0; i < exp.length(); i++)
            {
                switch (exp.charAt(i))
                {
                    case ' ':
                    {
                        if (!buffer.isEmpty())
                        {
                            stack.push(Double.parseDouble(buffer.toString()));
                            buffer = new StringBuilder();
                        }
                        break;
                    }
                    case '+':
                    {
                        if (stack.getSize() < 2)
                        {
                            showMessage_signPositionError();
                            return;
                        }
                        stack.push(stack.pop() + stack.pop());
                        break;
                    }
                    case '*':
                    {
                        if (stack.getSize() < 2)
                        {
                            showMessage_signPositionError();
                            return;
                        }
                        stack.push(stack.pop() * stack.pop());
                        break;
                    }
                    case '/':
                    {
                        if (stack.getSize() < 2)
                        {
                            showMessage_signPositionError();
                            return;
                        }
                        double a,b,c;
                        b = stack.pop();
                        a = stack.pop();
                        c = a/b;
                        if (c == Double.POSITIVE_INFINITY || c == Double.NEGATIVE_INFINITY)
                        {
                            showMessage_divisionByZeroError();
                            return;
                        }
                        stack.push(c);
                        break;
                    }
                    default:
                    {
                        buffer.append(exp.charAt(i));
                    }
                }
            }

            if (stack.isEmpty() && !buffer.isEmpty())
            {
                showMessage_allIsOkay(Double.parseDouble(buffer.toString()));
                return;
            }

            if (!buffer.isEmpty() || stack.getSize() != 1) showMessage_signCountError();
            else showMessage_allIsOkay(stack.pop());
        }

        protected void showMessage_allIsOkay(double result)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Результат вычисления: " + result + ".",
                    "Успешный парсинг",
                    JOptionPane.INFORMATION_MESSAGE
                    );
        }

        protected void showMessage_signCountError()
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Перепроверьте количество арифметических знаков.",
                    "Неверный формат",
                    JOptionPane.WARNING_MESSAGE
            );
        }

        protected void showMessage_signPositionError()
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Расположение арифметических знаков не соответствует обратной польской записи.",
                    "Неверный формат",
                    JOptionPane.WARNING_MESSAGE
            );
        }

        protected void showMessage_divisionByZeroError()
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Результат арифметического выражения не определён. Присутствует деление на нуль.",
                    "Успещный парсинг",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
