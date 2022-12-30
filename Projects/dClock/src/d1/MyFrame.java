package d1;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {


    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
//        this.setResizable(false);

        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("San serif",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x0EEE0E));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
//        dayLabel.setForeground(new Color(0xFFC70E));
//        dayLabel.setBackground(Color.black);
//        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
        dateLabel.setForeground(new Color(0xFFC70E));
        dateLabel.setBackground(Color.black);
        dateLabel.setOpaque(true);



        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        this.setVisible(true);

        setTime();
    }
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
