import com.home.language.LangSwitcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class General {

    private JFrame frame;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    General window = new General();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public General() throws IOException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() throws IOException {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        final JTextArea textArea = new JTextArea();
        textArea.setBounds(16, 10, 377, 61);
        textArea.setLineWrap(true);
        frame.getContentPane().add(textArea);

        final JTextArea textArea_1 = new JTextArea();
        textArea_1.setLineWrap(true);
        textArea_1.setBounds(16, 83, 377, 61);
        frame.getContentPane().add(textArea_1);

        JButton btnNewButton = new JButton("Switch");
        btnNewButton.setBounds(153, 145, 117, 29);
        frame.getContentPane().add(btnNewButton);




        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                LangSwitcher langSwitcher = null;
                langSwitcher = new LangSwitcher(textArea.getText());
                char[] answer = langSwitcher.getSwitcher();
                String str = String.valueOf(answer);
                textArea_1.setText(str);


                System.out.println(Arrays.toString(langSwitcher.getSwitcher()));


            }
        });


    }

}



