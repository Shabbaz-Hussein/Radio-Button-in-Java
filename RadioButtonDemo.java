import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioButtonDemo extends JFrame
{
    JLabel imageLabel;
    JRadioButton bird;
    JRadioButton cat;
    JRadioButton dog;
    JRadioButton rabbit;
    JRadioButton pig;

    RadioButtonDemo()
    {
        setTitle("RadioButtonDemo");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.EAST);

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("cat");
        dog = new JRadioButton("dog");
        rabbit = new JRadioButton("rabbit");
        pig = new JRadioButton("pig");

        ButtonGroup BG = new ButtonGroup();
        BG.add(bird);
        BG.add(cat);
        BG.add(dog);
        BG.add(rabbit);
        BG.add(pig);

        JPanel P = new JPanel();
        P.setLayout(new BoxLayout(P, BoxLayout.Y_AXIS));
        P.add(bird);
        P.add(cat);
        P.add(dog);
        P.add(rabbit);
        P.add(pig);
        add(P, BorderLayout.WEST);

        bird.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                showImage("bird.jpeg");
            }
        });

        cat.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                showImage("cat.jpeg");
            }
        });

        dog.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                showImage("dog.jpeg");
           } 
        });

        rabbit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                showImage("rabbit.jpeg");
            }
        });

        pig.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                showImage("pig.jpeg");
            }
        });
    }

    void showImage(String imageName)
    {
        String imagePath = "C:\\Users\\Malaki\\Documents\\Projects\\Assignment\\Pictures\\" + imageName;
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            RadioButtonDemo RBD = new RadioButtonDemo();
            RBD.setVisible(true);
        });
    }
}