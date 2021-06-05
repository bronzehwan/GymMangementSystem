package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Member.MemberInput;
import manager.MemberManager;

public class MemberViewer extends JPanel {
	
	WindowFrame frame;
	
	MemberManager membermanager;

	public MemberViewer(WindowFrame frame, MemberManager membermanager) {
		this.frame = frame;
		this.membermanager = membermanager;
		System.out.println("***" + membermanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Phone");
		model.addColumn("Weight");
		
		for(int i = 0; i<membermanager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = membermanager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getPhone());
			row.add(mi.getWeight());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
