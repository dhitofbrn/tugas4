import javax.swing.*;

class ObjekGUI {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame {
   final JTextField falamat = new JTextField(10);
   JLabel ljudul = new JLabel(" Biodata Diri ");
   JLabel lnama = new JLabel(" Dhito Febrian ");
   JLabel lttd = new JLabel(" Batam, February 19 2000 ");
   JLabel labelGambar;
  

   JRadioButton rbPria = new JRadioButton(" Male ");
   JRadioButton rbWanita = new JRadioButton(" Female ");

    String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lalamat = new JLabel(" Alamat ");

   

   JButton btnSave = new JButton("SAVE");
   JButton btnEdit = new JButton("EDIT");

   public GUI() {
	setTitle("Mencoba Kombinasi Komponen GUI");
	setDefaultCloseOperation(3);
	setSize(300,600);

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);
        labelGambar = new JLabel (new ImageIcon (getClass().getResource(("Gambar.jpg"))));
    
	setLayout(null);
        add(ljudul);
        add(labelGambar);
	add(lnama);
	add(lttd);
	add(rbPria);
	add(rbWanita);
	add(cmbAgama);
	add(lalamat);
        add(falamat);
	add(btnSave);
        add(btnEdit);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        ljudul.setBounds(105,10,150,20);
        labelGambar.setBounds(50,35,200,180);
	lnama.setBounds(100,220,120,20);
	lttd.setBounds(65,250,200,20);
	rbPria.setBounds(50,280,100,20);
	rbWanita.setBounds(150,280,100,20);
	
	cmbAgama.setBounds(60,320,150,20);
        lalamat.setBounds(105,350,100,20);
        falamat.setBounds(80,380,100,25);
	btnSave.setBounds(45,430,70,20);
        btnEdit.setBounds(145,430,70,20);
	setVisible(true);
   }
}
