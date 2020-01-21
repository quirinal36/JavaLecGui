package www.jca.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener{

	public MainFrame() {
		int width = 400;		// 길이
		int height = 200;		// 높이

		JPanel panel = new JPanel();
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);
		
		panel.setBackground(Color.BLUE);
		JButton button = new JButton("button1");
		panel.add(button, BorderLayout.NORTH);
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
		JPanel centerPanel = new JPanel(flowLayout);
		centerPanel.setBackground(Color.YELLOW);
		panel.add(centerPanel, 1);
		
		setContentPane(panel);
		
		setSize(width, height);
		setVisible(true);
		
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel centerPane = (JPanel)getContentPane().getComponent(1);
		
		System.out.println("button clicked~!");
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(">>" + i);
				JButton label = new JButton(""+i);
				
				centerPane.add(label);
			}
		}
		
		revalidate();
	}
}
