package com.yuriybishel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatChasingMouse extends JPanel {
    private static final int WIDTH = 800; // ширина окна игры
    private static final int HEIGHT = 600; // высота окна игры
    private static final int CAT_SPEED = 5; // скорость движения кота
    private static final int MOUSE_SPEED = 3; // скорость движения мыши
    private static final int MOUSE_SIZE = 20; // размер мыши
    private static final int CAT_SIZE = 50; // размер кота
    private static final Color CAT_COLOR = Color.RED; // цвет кота
    private static final Color MOUSE_COLOR = Color.BLUE; // цвет мыши

    private Point catPosition; // координаты кота
    private Point mousePosition; // координаты мыши
    private Random random; // генератор случайных чисел

    public CatChasingMouse() {
        // Устанавливаем размер окна игры
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // Инициализируем генератор случайных чисел
        random = new Random();

        // Инициализируем координаты кота и мыши
        catPosition = new Point(WIDTH / 2, HEIGHT / 2);
        mousePosition = new Point(random.nextInt(WIDTH - MOUSE_SIZE), random.nextInt(HEIGHT - MOUSE_SIZE));

        // Устанавливаем обработчик событий мыши
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Перемещаем мышь в случайную позицию по клику
                mousePosition.setLocation(random.nextInt(WIDTH - MOUSE_SIZE), random.nextInt(HEIGHT - MOUSE_SIZE));
            }
        });

        // Запускаем основной цикл игры
        while (true) {
            // Перемещаем кота в сторону мыши
            if (catPosition.x < mousePosition.x) {
                catPosition.x += CAT_SPEED;
            } else if (catPosition.x > mousePosition.x) {
                catPosition.x -= CAT_SPEED;
            }
            if (catPosition.y < mousePosition.y) {
                catPosition.y += CAT_SPEED;
            } else if (catPosition.y > mousePosition.y) {
                catPosition.y -= CAT_SPEED;
            }

            // Перемещаем мышь в случайную позицию, если кот догнал ее
            if (catPosition.distance(mousePosition) < CAT_SIZE / 2 + MOUSE_SIZE / 2) {
                mousePosition.setLocation(random.nextInt(WIDTH - MOUSE_SIZE), random.nextInt(HEIGHT - MOUSE_SIZE));
            }

            // Перерисовываем окно игры
            repaint();

            // Задержка между кадрами
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Рисуем кота и мышь
        g.setColor(CAT_COLOR);
        g.fillOval(catPosition.x - CAT_SIZE / 2, catPosition.y - CAT_SIZE / 2, CAT_SIZE, CAT_SIZE);
        g.setColor(MOUSE_COLOR);
        g.fillOval(mousePosition.x, mousePosition.y, MOUSE_SIZE, MOUSE_SIZE);
    }
    public static void main(String[] args) {
        // Создаем окно игры
        JFrame frame = new JFrame("Cat Chasing Mouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Добавляем игровую панель в окно
        CatChasingMouse gamePanel = new CatChasingMouse();
        frame.getContentPane().add(gamePanel);

        // Отображаем окно на экране
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}